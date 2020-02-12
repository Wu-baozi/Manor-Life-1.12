package com.gonggongjohn.manorlife.handlers;

import com.gonggongjohn.manorlife.items.ItemCropBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public static final List<Item> items = new ArrayList<Item>();

    public static final Item soybean = new ItemCropBase("soybean");
}
