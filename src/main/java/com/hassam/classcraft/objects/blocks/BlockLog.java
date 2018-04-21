package com.hassam.classcraft.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockLog extends BlockBase {

	public BlockLog(String name, Material material) {
		super(name, material);
		this.setHardness(2.0F);
        this.setSoundType(SoundType.WOOD);
	}

}
