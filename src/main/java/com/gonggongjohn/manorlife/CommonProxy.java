package com.gonggongjohn.manorlife;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

	public void registerItemRenderer(Item item, int meta, String id) {

	}

	public IThreadListener getThreadListener(MessageContext context) {
		if (context.side.isServer()) {
			return context.getServerHandler().player.mcServer;
		} else
			return null;
	}

	public EntityPlayer getPlayer(MessageContext context) {
		if (context.side.isServer()) {
			return context.getServerHandler().player;
		} else
			return null;
	}
}
