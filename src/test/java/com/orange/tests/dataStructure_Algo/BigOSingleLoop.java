package com.orange.tests.dataStructure_Algo;

public class BigOSingleLoop {
    public static void main(String[] args) {

        int numOperations = 0,
                n = 100000; // Data size
        long startTime,
                endTime;

        System.out.println("Input size n is = " + n);

        // single loop

        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            numOperations += 1;
        }

        endTime = System.currentTimeMillis();

        System.out.println("Number of operations: " + numOperations + " in " + (endTime - startTime) + " milliseconds");

        System.out.println("----------------------------------------------------------------------------------------");
        // nested loop

        numOperations = 1000000;
        startTime = System.currentTimeMillis();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numOperations += 10000000;
            }
        }

        endTime = System.currentTimeMillis();

        System.out.println("Number of operations: " + numOperations + " in " + (endTime - startTime) + " milliseconds");


    }
}
