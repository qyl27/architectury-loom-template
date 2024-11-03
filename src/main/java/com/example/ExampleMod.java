package com.example;

public class ExampleMod {
    public static final String MODID = "example";

    public static void init() {
        System.out.println("Hello! I'm running on " + ModPlatform.getPlatform());
    }

    public static void initClient() {
        System.out.println("Hello from client init.");
    }
}
