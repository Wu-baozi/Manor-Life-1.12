package com.gonggongjohn.manorlife;

import com.gonggongjohn.manorlife.client.animation.EmptyStateMapper;
import com.gonggongjohn.manorlife.handlers.BlockHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy{
    @Override
	public void preInit(FMLPreInitializationEvent event){
    	super.preInit(event);
    	ModelLoader.setCustomStateMapper(BlockHandler.blockMill, new EmptyStateMapper());
    	ModelLoader.setCustomStateMapper(BlockHandler.blockStoneMill, new EmptyStateMapper());
    	ModelLoader.setCustomStateMapper(BlockHandler.blockStoneMillActing, new EmptyStateMapper());
    	ModelLoader.setCustomStateMapper(BlockHandler.blockStoneMillDone, new EmptyStateMapper());
    }

    @Override
	public void init(FMLInitializationEvent event){
        super.init(event);
    }

    @Override
	public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }

    @Override
	public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
	public IThreadListener getThreadListener(MessageContext context){
        if (context.side.isClient())
        {
            return Minecraft.getMinecraft();
        }
        else
        {
            return context.getServerHandler().player.mcServer;
        }
    }

    @Override
	public EntityPlayer getPlayer(MessageContext context)
    {
        if (context.side.isClient())
        {
            return Minecraft.getMinecraft().player;
        }
        else
        {
            return context.getServerHandler().player;
        }
    }
}
