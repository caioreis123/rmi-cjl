package edu.ifba;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Hello world!
 *
 */
public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("Server is running...");
            Calculator calculator = new Calculator();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/Calc", calculator);
            System.out.println("Server is ready!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
