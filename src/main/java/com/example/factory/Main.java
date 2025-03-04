package com.example.factory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "4 GB", "1 TB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "16 GB", "2 TB", "3.0 GHz");

        System.out.println("PC Config: " + pc);
        System.out.println("Server Config: " + server);
    }
}