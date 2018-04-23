package com.hassam.advanced.core;

import com.hassam.advanced.handler.ClientTickHandler;
import com.hassam.advanced.proxy.ClientProxy;
import com.hassam.advanced.proxy.CommonProxy;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.network.FMLEventChannel;

@Mod(modid="ccaMod", name="Advanced Motion Mod", version="1.0", acceptedMinecraftVersions="[1.12.2]")
public class ParkourMod {
    public static final String MODID = "cca";
    public static final String NAME = "Advanced Motion Mod";
    public static final String VERSION = "1.0";
    public static final String CHANNEL = "parkour";
    public static FMLEventChannel channel;
    @Mod.Instance(value="ParkourMod")
    public static ParkourMod instance;
    @SidedProxy(clientSide="com.hassam.advanced.proxy.ClientProxy", serverSide="com.hassam.advanced.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static ClientProxy cproxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.registerKeyBindings();
        FMLCommonHandler.instance().bus().register((Object)new ClientTickHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerServerTickHandler();
        CommonProxy.registerChannel();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}

