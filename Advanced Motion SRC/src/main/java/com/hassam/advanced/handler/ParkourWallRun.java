
package com.hassam.advanced.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class ParkourWallRun {
    public static void wallRun(EntityPlayer player, World world) {
        if (player.collidedHorizontally && player.isSprinting()) {
            if (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY, player.posZ), new BlockPos(player.posX, player.posY, player.posZ)))) {
                player.motionY = world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ), new BlockPos(player.posX, player.posY + 1.0, player.posZ))) ? (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ), new BlockPos(player.posX, player.posY + 2.0, player.posZ))) ? 0.7 : 0.65) : 0.5;
                player.fallDistance = 0.0f;
            }
            if (world.isBlockModifiable(player, new BlockPos(player.posX, player.posY, player.posZ)) && world.isBlockModifiable(player, new BlockPos(player.posX, player.posY + 1.0, player.posZ))) {
                if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 0 && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY, player.posZ + 1.0), new BlockPos(player.posX, player.posY, player.posZ + 1.0)))) {
                    player.motionY = world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ + 1.0))) ? (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ + 1.0), new BlockPos(player.posX, player.posY + 2.0, player.posZ + 1.0))) ? 0.7 : 0.65) : 0.5;
                    player.fallDistance = 0.0f;
                }
                if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 1 && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY, player.posZ), new BlockPos(player.posX - 1.0, player.posY, player.posZ)))) {
                    player.motionY = world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 1.0, player.posZ))) ? (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ), new BlockPos(player.posX - 1.0, player.posY + 2.0, player.posZ))) ? 0.7 : 0.65) : 0.5;
                    player.fallDistance = 0.0f;
                }
                if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 2 && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY, player.posZ - 1.0), new BlockPos(player.posX, player.posY, player.posZ - 1.0)))) {
                    player.motionY = world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 1.0, player.posZ - 1.0))) ? (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX, player.posY + 2.0, player.posZ - 1.0), new BlockPos(player.posX, player.posY + 2.0, player.posZ - 1.0))) ? 0.7 : 0.65) : 0.5;
                    player.fallDistance = 0.0f;
                }
                if ((MathHelper.floor((double)((double)(player.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3) == 3 && world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY, player.posZ), new BlockPos(player.posX + 1.0, player.posY, player.posZ)))) {
                    player.motionY = world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 1.0, player.posZ))) ? (world.checkBlockCollision(new AxisAlignedBB(new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ), new BlockPos(player.posX + 1.0, player.posY + 2.0, player.posZ))) ? 0.7 : 0.65) : 0.5;
                    player.fallDistance = 0.0f;
                }
            }
        }
    }
}

