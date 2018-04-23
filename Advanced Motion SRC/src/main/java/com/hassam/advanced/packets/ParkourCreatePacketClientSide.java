package com.hassam.advanced.packets;

import com.hassam.advanced.core.ParkourMod;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;

public class ParkourCreatePacketClientSide {
    public static FMLProxyPacket createC2SKeyBindingPacket(int keyID) throws IOException {
        ByteBufOutputStream bbos = new ByteBufOutputStream(Unpooled.buffer());
        bbos.writeInt(keyID);
        FMLProxyPacket thePacket = new FMLProxyPacket(new PacketBuffer(bbos.buffer()), "parkour");
        bbos.close();
        return thePacket;
    }

    public static void sendToServer(FMLProxyPacket parPacket) {
        ParkourMod.channel.sendToServer(parPacket);
    }

    public static void sendC2SKeyBindingPacket(int keyID) {
        try {
            ParkourCreatePacketClientSide.sendToServer(ParkourCreatePacketClientSide.createC2SKeyBindingPacket(keyID));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

