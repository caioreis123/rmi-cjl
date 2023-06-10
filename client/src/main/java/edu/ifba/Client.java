package edu.ifba;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try{
            System.out.println("Client is running...");

            ICalculator calculator = (ICalculator) Naming.lookup("rmi://localhost:1099/Calc");
            System.out.println("Addition: " + calculator.add(20, 10));
            System.out.println("Subtraction: " + calculator.subtract(20, 10));
            System.out.println("Multiplication: " + calculator.multiply(20, 10));
            System.out.println("Division: " + calculator.divide(20, 10));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}