package org.example.javaExamples.okPackage.YesPAckage;

public class Factorial {
    public static void main(String[] args) {
        int number = 4;
        int factorialSum = 1;
        for(int i = 1 ; i <=number; i++) {
            factorialSum = factorialSum * i;
        }
        System.out.println("Factorial of " + number + " is " + factorialSum);
    }
    }

