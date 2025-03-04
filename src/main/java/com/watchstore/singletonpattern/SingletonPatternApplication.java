package com.watchstore.singletonpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonPatternApplication.class, args);
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
