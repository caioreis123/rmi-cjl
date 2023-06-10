package edu.ifba;

import java.rmi.Remote;

public interface ICalculator extends Remote {
    int add(int a, int b) throws Exception;
    int subtract(int a, int b) throws Exception;
    int multiply(int a, int b) throws Exception;
    int divide(int a, int b) throws Exception;
}
