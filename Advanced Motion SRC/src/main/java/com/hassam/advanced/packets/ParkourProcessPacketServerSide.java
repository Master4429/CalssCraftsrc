package com.hassam.advanced.packets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;

public class ParkourProcessPacketServerSide {
    public static void processPacketOnServer(ByteBuf parBB, Side parSide, EntityPlayerMP parPlayer) throws IOException {
        if (parSide == Side.SERVER) {
            ByteBufInputStream bbis = new ByteBufInputStream(parBB);
            int keyID = bbis.readInt();
            if (keyID == 1) {
            }
            bbis.close();
        }
    }
}

