package com.hassam.advanced.core;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ParkourKeyBindings {
    public static KeyBinding climbUp;
    public static KeyBinding climbDown;

    public static void init() {
        climbUp = new KeyBinding("key.climbUp", 56, "key.categories.Parkour");
        climbDown = new KeyBinding("key.climbDown", 45, "key.categories.Parkour");
        ClientRegistry.registerKeyBinding((KeyBinding)climbUp);
        ClientRegistry.registerKeyBinding((KeyBinding)climbDown);
    }
}

