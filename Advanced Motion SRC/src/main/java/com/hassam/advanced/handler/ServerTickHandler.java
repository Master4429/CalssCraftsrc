
package com.hassam.advanced.handler;

import com.hassam.advanced.handler.ParkourGrabNew;
import com.hassam.advanced.handler.ParkourRoll;
import com.hassam.advanced.handler.ParkourWallRunNew;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ServerTickHandler {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        World world = player.getEntityWorld();
        ParkourWallRunNew.wallRun(player, world);
        ParkourRoll.roll(player);
        ParkourGrabNew.muscleUp(player, world);
        ParkourGrabNew.catLeap(player, world);
        ParkourGrabNew.hang(player, world);
        ParkourGrabNew.hangBellow(player, world);
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
    }

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {
    }

    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event) {
    }

    @SubscribeEvent
    public void onWorldTick(TickEvent.WorldTickEvent event) {
    }

    public int toInt(double d) {
		return 0;
    }
}

