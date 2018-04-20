package com.hassam.classcraft.objects.items;

import com.hassam.classcraft.init.ItemInit;
import com.hassam.classcraft.proxy.ClientProxy;
import com.hassam.classcraft.util.IHasModel;
import com.hassam.classcraft.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	protected String name;
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabCC);
		this.name = name;
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}