package com.gonggongjohn.manorlife.items;

import com.gonggongjohn.manorlife.ManorLife;
import com.gonggongjohn.manorlife.handlers.ItemHandler;
import com.gonggongjohn.manorlife.utils.IHasModel;
import net.minecraft.item.Item;

public class ItemCropBase extends Item implements IHasModel {

    public ItemCropBase(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ManorLife.tabManorLife);
        ItemHandler.items.add(this);
    }

    @Override
    public void registerModel() {
        ManorLife.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
