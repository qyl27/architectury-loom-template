package com.example;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ModPlatform {
    @ExpectPlatform
    public static String getPlatform() {
        throw new AssertionError();
    }
}
