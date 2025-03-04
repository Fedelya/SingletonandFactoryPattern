package com.watchstore.singletonpattern;

public class Main {
    public static void main(String[] args) {
        // Test Eager Singleton
        System.out.println("Testing Eager Singleton:");
        EagerInitializedSingleton eager1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eager2 = EagerInitializedSingleton.getInstance();
        eager1.showMessage();
        System.out.println("eager1 == eager2: " + (eager1 == eager2));

        // Test Bill Pugh Singleton
        System.out.println("\nTesting Bill Pugh Singleton:");
        BillPughSingleton bill1 = BillPughSingleton.getInstance();
        BillPughSingleton bill2 = BillPughSingleton.getInstance();
        bill1.showMessage();
        System.out.println("bill1 == bill2: " + (bill1 == bill2));
    }
}