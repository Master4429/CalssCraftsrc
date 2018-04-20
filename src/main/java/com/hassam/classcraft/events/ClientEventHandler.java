package com.hassam.classcraft.events;

import com.hassam.classcraft.gui.GuiCustomMainMenu;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientEventHandler {

	@SubscribeEvent
	public void onGuiOpen(GuiOpenEvent event) {
		if(event.getGui() instanceof GuiMainMenu){
			event.setGui(new GuiCustomMainMenu());
		}
	}
}
