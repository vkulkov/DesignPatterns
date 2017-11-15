package com.lesson_11;

import com.lesson_11.secure.NonOwnerInvocationHandler;
import com.lesson_11.secure.OwnerInvocationHandler;
import com.lesson_11.secure.PersonBean;
import com.lesson_11.secure.PersonBeanImpl;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class SecurityProxyTest {
    private Map<String, PersonBean> datingDB = new HashMap<>();

    public static void main(String[] args) {
        new SecurityProxyTest().drive();
    }

    public SecurityProxyTest() {
        initializeDatabase();
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getProxy(joe, true);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getProxy(joe, false);
        System.out.println("\nName is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non-owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getProxy(PersonBean person, boolean owner) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                owner ? new OwnerInvocationHandler(person) : new NonOwnerInvocationHandler(person));
    }

    PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
