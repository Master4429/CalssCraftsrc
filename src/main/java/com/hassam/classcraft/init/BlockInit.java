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
	public static final Block LOG_COPPER = new BlockBase("log_copper", Material.IRON);
	public static final Block LEAVES_BINARY = new BlockBase("leaves_binary", Material.LEAVES);
	public static final Block INFECTED_MOTHERBOARD = new BlockBase("infected_motherboard", Material.ROCK);
	public static final Block BASEBOARD = new BlockBase("baseboard", Material.ROCK);
	public static final Block BLOCK_VIRUS = new BlockBase("block_virus", Material.ROCK);
}