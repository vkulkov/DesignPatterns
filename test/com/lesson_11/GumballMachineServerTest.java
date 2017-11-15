package com.lesson_11;

import com.lesson_11.remote.GumballMachine;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineServerTest {
    public static void main(String[] args) {
        System.out.println("RMI server starting...");
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("Java RMI registry created");

            GumballMachine gumballMachine = new GumballMachine("Seattle", 120);
            Naming.bind("//localhost/gumball", gumballMachine);
            System.out.println("PeerServer bound in registry");
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
