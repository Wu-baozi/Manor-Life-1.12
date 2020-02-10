package com.gonggongjohn.manorlife;

import net.minecraft.crash.CrashReport;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ReportedException;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ManorLife.MODID, name = ManorLife.NAME, version = ManorLife.VERSION, useMetadata = true)
public class ManorLife {
	public static final String MODID = "manorlife";
	public static final String NAME = "Manor Life";
	public static final String VERSION = "0.0.1";

	@Mod.Instance
	public static ManorLife instance;

	@SidedProxy(clientSide = "com.gonggongjohn.manorlife.ClientProxy", serverSide = "com.gonggongjohn.manorlife.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		
	}

	public static CommonProxy getProxy() {
		return proxy;
	}
}
