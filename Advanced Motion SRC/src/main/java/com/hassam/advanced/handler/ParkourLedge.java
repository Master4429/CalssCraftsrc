package com.hassam.advanced.handler;

import com.hassam.advanced.core.ParkourKeyBindings;
import com.hassam.advanced.packets.ParkourCreatePacketClientSide;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ParkourLedge {
    public static void muscleUp(EntityPlayer player, World world) {
        if (player.isSneaking()) {
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY, player.posZ + 0.6), new BlockPos(player.posX, player.posY, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6), new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY, player.posZ - 0.6), new BlockPos(player.posX, player.posY, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6), new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY, player.posZ), new BlockPos(player.posX + 0.6, player.posY, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ), new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY, player.posZ), new BlockPos(player.posX - 0.6, player.posY, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ), new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY, player.posZ + 0.6), new BlockPos(player.posX + 0.6, player.posY, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6), new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY, player.posZ - 0.6), new BlockPos(player.posX - 0.6, player.posY, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6), new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY, player.posZ - 0.6), new BlockPos(player.posX + 0.6, player.posY, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6), new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY, player.posZ + 0.6), new BlockPos(player.posX - 0.6, player.posY, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6), new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
        }
    }

    public static void catLeap(EntityPlayer player, World world) {
        NBTTagCompound tag = player.getEntityData();
        if (player.isSneaking()) {
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6), new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6), new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6), new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6), new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ), new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ), new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ), new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ), new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6), new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6), new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6), new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6), new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6), new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6), new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6), new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6), new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
        }
    }

    public static void hang(EntityPlayer player, World world) {
        NBTTagCompound tag = player.getEntityData();
        if (player.isSneaking() && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ), new BlockPos(player.posX, player.posY + 2.0, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 3.0, player.posZ), new BlockPos(player.posX, player.posY + 3.0, player.posZ)))) {
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6), new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 3.0, player.posZ + 0.6), new BlockPos(player.posX, player.posY + 3.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6), new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 3.0, player.posZ - 0.6), new BlockPos(player.posX, player.posY + 3.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ), new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ), new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ), new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ), new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6), new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ + 0.6), new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6), new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ - 0.6), new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6), new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ - 0.6), new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ - 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6), new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ + 0.6), new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ + 0.6)))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
        }
    }

    public static void hangBellow(EntityPlayer player, World world) {
        NBTTagCompound tag = player.getEntityData();
        if (player.isSneaking() && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ), new BlockPos(player.posX, player.posY + 2.0, player.posZ))) && !world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 3.0, player.posZ), new BlockPos(player.posX, player.posY + 3.0, player.posZ)))) {
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 2.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 3.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 3.0, player.posZ + 1.0))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 2.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 3.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 3.0, player.posZ - 1.0))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ + 1.0), new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ + 1.0), new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ + 1.0), new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ))) && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ - 1.0), new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ - 1.0), new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ - 1.0), new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ))) && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ - 1.0), new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ - 1.0), new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ - 1.0), new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ - 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ))) && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
            if (!(world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ + 1.0), new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ + 1.0), new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ + 1.0), new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ + 1.0))) || world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ))) && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0))))) {
                player.fallDistance = 0.0f;
                player.motionY = ParkourKeyBindings.climbUp.isKeyDown() ? 0.3 : 0.0;
            }
        }
    }

    public static void climbDown(EntityPlayer player, World world) {
        NBTTagCompound tag = player.getEntityData();
        if (player.motionY == 0.0 && ParkourKeyBindings.climbDown.isKeyDown()) {
            player.motionY = -0.15;
        }
        if (player.onGround && ParkourKeyBindings.climbDown.isKeyDown()) {
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 0) {
                player.motionZ = 0.15;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 1) {
                player.motionX = -0.15;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 2) {
                player.motionZ = -0.15;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 3) {
                player.motionX = 0.15;
            }
        }
        if (!player.onGround && ParkourKeyBindings.climbDown.isKeyDown()) {
            player.setSneaking(true);
            player.motionZ = 0.0;
            player.motionX = 0.0;
            ParkourCreatePacketClientSide.sendC2SKeyBindingPacket(1);
        }
    }
}

