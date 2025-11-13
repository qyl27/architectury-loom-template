package com.example.forge;

import com.example.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MODID)
public class ExampleModForge {
    public ExampleModForge(FMLJavaModLoadingContext context) {
        var bus = context.getModEventBus();
        bus.addListener(this::setupClient);

        ExampleMod.init();
    }

    private void setupClient(FMLClientSetupEvent event) {
        ExampleMod.initClient();
    }
}
