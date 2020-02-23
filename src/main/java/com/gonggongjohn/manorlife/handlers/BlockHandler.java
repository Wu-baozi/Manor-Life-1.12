package com.gonggongjohn.manorlife.handlers;

import com.gonggongjohn.manorlife.blocks.BlockMill;
import com.gonggongjohn.manorlife.blocks.BlockStoneMill;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockHandler {
    public static final List<Block> blocks = new ArrayList<Block>();

    public static final Block blockMill = new BlockMill();
    public static final Block blockStoneMill = new BlockStoneMill();
}
