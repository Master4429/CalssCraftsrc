package com.hassam.classcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.hassam.classcraft.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item SILICON = new ItemBase("silicon");
	public static final Item MICROCHIP = new ItemBase("microchip");
	public static final Item CIRCUIT = new ItemBase("circuit");
	public static final Item COPPERWIRE = new ItemBase("copperwire");
	public static final Item CAPACITOR = new ItemBase("capacitor");
	public static final Item BATTERY = new ItemBase("battery");
}
