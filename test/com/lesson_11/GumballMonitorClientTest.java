package com.lesson_11;

import com.lesson_11.remote.GumballMachineRemote;
import com.lesson_11.remote.GumballMonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorClientTest {
    public static void main(String[] args) {
        System.out.println("RMI client starting...");
        try {
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("//localhost/gumball");
            GumballMonitor monitor = new GumballMonitor(machine);

            monitor.report();
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
