package com.gonggongjohn.manorlife.handlers;

import com.gonggongjohn.manorlife.capabilities.CapabilityNutritions;
import com.gonggongjohn.manorlife.capabilities.INutritions;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class CapabilityHandler {
    @CapabilityInject(INutritions.class)
    public static Capability<INutritions> capNutritions;

    @SuppressWarnings("deprecation")
    public static void setupCapabilities(){
        CapabilityManager.INSTANCE.register(INutritions.class, new CapabilityNutritions.Storage(), CapabilityNutritions.Implementation.class);
    }
}
