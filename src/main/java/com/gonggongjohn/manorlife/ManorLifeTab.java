package com.gonggongjohn.manorlife;

import com.gonggongjohn.manorlife.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ManorLifeTab extends CreativeTabs {
    public ManorLifeTab() {
        super("manorlifetab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemHandler.soybean);
    }
}
