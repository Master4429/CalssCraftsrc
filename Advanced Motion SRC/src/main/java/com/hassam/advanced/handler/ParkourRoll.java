package com.hassam.advanced.handler;

import net.minecraft.entity.player.EntityPlayer;

public class ParkourRoll {
    public static int rollTimer = 0;

    public static void roll(EntityPlayer player) {
        if (player.onGround && player.isSprinting() && player.fallDistance > 3.0f) {
            rollTimer = 40;
            player.fallDistance = player.fallDistance <= 5.0f ? 0.0f : (player.fallDistance -= 5.0f);
        }
    }
}

