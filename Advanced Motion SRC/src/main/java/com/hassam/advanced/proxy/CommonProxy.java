package com.hassam.advanced.proxy;

import com.hassam.advanced.core.ParkourMod;
import com.hassam.advanced.handler.ServerTickHandler;
import com.hassam.advanced.packets.ParkourServerPacketHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
    public void registerServerTickHandler() {
        FMLCommonHandler.instance().bus().register((Object)new ServerTickHandler());
    }

    public static void registerChannel() {
        ParkourMod.channel = NetworkRegistry.INSTANCE.newEventDrivenChannel("parkour");
        ParkourMod.channel.register((Object)new ParkourServerPacketHandler());
    }

    public void registerKeyBindings() {
    }
}

