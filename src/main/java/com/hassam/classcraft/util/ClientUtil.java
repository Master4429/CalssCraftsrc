package com.hassam.classcraft.util;

import com.hassam.classcraft.gui.GuiCustomMainMenu;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.gui.NotificationModUpdateScreen;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.common.ForgeVersion.Status;

public class ClientUtil {

	public static NotificationModUpdateScreen initMenu(GuiCustomMainMenu guiMainMenu, GuiButton modButton)
    {
        NotificationModUpdateScreen notificationModUpdateScreen = new NotificationModUpdateScreen(modButton);
        notificationModUpdateScreen.setGuiSize(guiMainMenu.width, guiMainMenu.height);
        notificationModUpdateScreen.initGui();
        return notificationModUpdateScreen;
    }
	
}
