package com.example.neoforge;

import com.example.ExampleMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(ExampleMod.MODID)
public class ExampleModNeoForge {
    public ExampleModNeoForge(ModContainer container, IEventBus bus) {
        bus.addListener(this::setupClient);

        ExampleMod.init();
    }

    private void setupClient(FMLClientSetupEvent event) {
        ExampleMod.initClient();
    }
}
