package edu.ifba;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator  extends UnicastRemoteObject implements ICalculator {
    protected Calculator() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws Exception {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws Exception {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) throws Exception {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws Exception {
        return a / b;
    }
}
