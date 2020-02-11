package com.gonggongjohn.manorlife.handlers;

import com.gonggongjohn.manorlife.ManorLife;
import com.gonggongjohn.manorlife.capabilities.CapabilityNutritions;
import com.gonggongjohn.manorlife.capabilities.INutritions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
    @SubscribeEvent
    public void onAttachCapabilitiesEntity(AttachCapabilitiesEvent<Entity> event){
        if(event.getObject() instanceof EntityPlayer){
            ICapabilitySerializable<NBTTagCompound> providerNutritions = new CapabilityNutritions.ProvidePlayer();
            event.addCapability(new ResourceLocation(ManorLife.MODID + ":" + "nutritions"), providerNutritions);
        }
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event){
        Capability<INutritions> capabilityNutritions = CapabilityHandler.capNutritions;
        Capability.IStorage<INutritions> storageNutritions = capabilityNutritions.getStorage();
        if(event.getOriginal().hasCapability(capabilityNutritions, null) && event.getEntityPlayer().hasCapability(capabilityNutritions, null)){
            NBTBase nbt = storageNutritions.writeNBT(capabilityNutritions, event.getOriginal().getCapability(capabilityNutritions, null), null);
            storageNutritions.readNBT(capabilityNutritions, event.getEntityPlayer().getCapability(capabilityNutritions, null), null, nbt);
        }
    }
}
