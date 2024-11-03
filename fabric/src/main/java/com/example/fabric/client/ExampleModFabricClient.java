package com.example.fabric.client;

import com.example.ExampleMod;
import net.fabricmc.api.ClientModInitializer;

public class ExampleModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExampleMod.initClient();
    }
}
