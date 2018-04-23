package com.hassam.advanced.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ParkourGrabNew {
    public static void muscleUp(EntityPlayer player, World world) {
        if (player.isSneaking()) {
            if (!world.getBlockState(new BlockPos(player.posX, player.posY, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX, player.posY, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY, player.posZ)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY, player.posZ)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
        }
    }

    public static void catLeap(EntityPlayer player, World world) {
        NBTTagCompound tag = player.getEntityData();
        if (player.isSneaking()) {
            if (!world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 1.0, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 1.0, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
        }
    }

    public static void hang(EntityPlayer player, World world) {
        NBTTagCompound tag = player.getEntityData();
        if (player.isSneaking() && world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX, player.posY + 3.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 3.0, player.posZ))) {
            if (!world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX, player.posY + 3.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 3.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX, player.posY + 3.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 3.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 2.0, player.posZ - 0.6)) && world.getBlockState(new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ - 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 0.6, player.posY + 3.0, player.posZ - 0.6))) {
                player.fallDistance = 0.0f;
            }
            if (!world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 2.0, player.posZ + 0.6)) && world.getBlockState(new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ + 0.6)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 0.6, player.posY + 3.0, player.posZ + 0.6))) {
                player.fallDistance = 0.0f;
            }
        }
    }

    public static void hangBellow(EntityPlayer player, World world) {
        if (player.isSneaking() && !world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX, player.posY + 3.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 3.0, player.posZ))) {
            if (world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0)) && world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ + 1.0)) && world.getBlockState(new BlockPos(player.posX, player.posY + 3.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 3.0, player.posZ + 1.0))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0)) && world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posZ - 1.0)) && world.getBlockState(new BlockPos(player.posX, player.posY + 3.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 3.0, player.posZ - 1.0))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ)) && world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ + 1.0)) && world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ + 1.0)) && world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ + 1.0)) && (world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ)) || world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0)))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ - 1.0)) && world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ - 1.0)) && world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ - 1.0)) && (world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ)) || world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0)))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ - 1.0)) && world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ - 1.0)) && world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 3.0, player.posZ - 1.0)) && (world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ)) || world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0)))) {
                player.fallDistance = 0.0f;
            }
            if (world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ + 1.0)) && world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ + 1.0)) && world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 3.0, player.posZ + 1.0)) && (world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ)) || world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0)))) {
                player.fallDistance = 0.0f;
            }
        }
    }
}

