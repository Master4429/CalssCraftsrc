package com.hassam.classcraft.objects.blocks;

import com.hassam.classcraft.Main;
import com.hassam.classcraft.init.BlockInit;
import com.hassam.classcraft.init.ItemInit;
import com.hassam.classcraft.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	protected String name;
	
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabCC);
		this.name = name;

		BlockInit.BLOCKS.add(this);
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(item, 0, name);
	}
	
}