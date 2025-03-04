package com.watchstore.singletonpattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println("Singleton được khởi tạo!");
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
}