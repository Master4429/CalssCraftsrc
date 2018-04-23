package com.hassam.advanced.packets;

import java.io.IOException;
import com.hassam.advanced.packets.ParkourProcessPacketServerSide;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class ParkourServerPacketHandler {
    protected String channelName;
    protected EntityPlayerMP thePlayer;

    @SubscribeEvent
    public void onServerPacket(FMLNetworkEvent.ServerCustomPacketEvent event) throws IOException {
        this.channelName = event.getPacket().channel();
        NetHandlerPlayServer theNetHandlerPlayServer = (NetHandlerPlayServer)event.getHandler();
        if (this.channelName.equals("parkour")) {
            ParkourProcessPacketServerSide.processPacketOnServer(event.getPacket().payload(), event.getPacket().getTarget(), this.thePlayer);
        }
    }
}

