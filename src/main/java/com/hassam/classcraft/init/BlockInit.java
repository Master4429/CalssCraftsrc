package com.hassam.classcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.hassam.classcraft.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block ORE_SILICON = new BlockBase("ore_silicon", Material.ROCK);
	public static final Block MOTHERBOARD = new BlockBase("motherboard", Material.ROCK);
	public static final Block TREE_COPPER = new BlockBase("tree_copper", Material.IRON);
	public static final Block LEAVES_BINARY = new BlockBase("leaves_binary", Material.LEAVES);
}