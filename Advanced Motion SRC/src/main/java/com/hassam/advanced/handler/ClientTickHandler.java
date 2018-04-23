package com.hassam.advanced.handler;

import com.hassam.advanced.handler.ParkourLedgeNew;
import com.hassam.advanced.handler.ParkourRoll;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientTickHandler {
    private static float pitch;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        World world = player.getEntityWorld();
        ParkourLedgeNew.muscleUp(player, world);
        ParkourLedgeNew.catLeap(player, world);
        ParkourLedgeNew.hang(player, world);
        ParkourLedgeNew.hangBellow(player, world);
        ParkourLedgeNew.climbDown(player, world);
        if (ParkourRoll.rollTimer > 0) {
            if (ParkourRoll.rollTimer == 40) {
            }

            --ParkourRoll.rollTimer;
        }
    }
}

