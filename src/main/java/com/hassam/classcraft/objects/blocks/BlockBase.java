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
	public BlockBase(String Name, Material material)
	{
		super(material);
		setUnlocalizedName(Name);
		setRegistryName(Name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		BlockInit.BLOCKS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}