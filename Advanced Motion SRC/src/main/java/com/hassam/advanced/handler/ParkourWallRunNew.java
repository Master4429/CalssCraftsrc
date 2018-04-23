package com.hassam.advanced.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ParkourWallRunNew {
    public static void wallRun(EntityPlayer player, World world) {
        if (player.collidedHorizontally && player.isSprinting()) {
            if (!world.getBlockState(new BlockPos(player.posX, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX))) {
                player.motionY = !world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX)) ? (!world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posX)) ? 0.75 : 0.65) : 0.5;
                player.fallDistance = 0.0f;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 0 && world.getBlockState(new BlockPos(player.posX, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX)) && world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX)) && !world.getBlockState(new BlockPos(player.posX, player.posY, player.posX + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX + 1.0))) {
                player.motionY = !world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX + 1.0)) ? (!world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posX + 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posX + 1.0)) ? 0.75 : 0.65) : 0.5;
                player.fallDistance = 0.0f;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 1 && world.getBlockState(new BlockPos(player.posX, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX)) && world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX)) && !world.getBlockState(new BlockPos(player.posX - 1.0, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY, player.posX))) {
                player.motionY = !world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posX)) ? (!world.getBlockState(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posX)) ? 0.75 : 0.65) : 0.5;
                player.fallDistance = 0.0f;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 2 && world.getBlockState(new BlockPos(player.posX, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX)) && world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX)) && !world.getBlockState(new BlockPos(player.posX, player.posY, player.posX - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX - 1.0))) {
                player.motionY = !world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX - 1.0)) ? (!world.getBlockState(new BlockPos(player.posX, player.posY + 2.0, player.posX - 1.0)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 2.0, player.posX - 1.0)) ? 0.75 : 0.65) : 0.5;
                player.fallDistance = 0.0f;
            }
            if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 3 && world.getBlockState(new BlockPos(player.posX, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY, player.posX)) && world.getBlockState(new BlockPos(player.posX, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX, player.posY + 1.0, player.posX)) && !world.getBlockState(new BlockPos(player.posX + 1.0, player.posY, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY, player.posX))) {
                player.motionY = !world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posX)) ? (!world.getBlockState(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posX)).getBlock().isPassable((IBlockAccess)world, new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posX)) ? 0.75 : 0.65) : 0.5;
                player.fallDistance = 0.0f;
            }
        }
    }
}

