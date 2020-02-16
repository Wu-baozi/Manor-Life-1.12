package com.gonggongjohn.manorlife.blocks;

import com.gonggongjohn.manorlife.ManorLife;
import com.gonggongjohn.manorlife.handlers.BlockHandler;
import com.gonggongjohn.manorlife.handlers.ItemHandler;
import com.gonggongjohn.manorlife.tile.TEMill;
import com.gonggongjohn.manorlife.utils.IHasModel;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockMill extends BlockContainer implements IHasModel{
    public final String name = "mill";

    public BlockMill() {
        super(Material.ROCK);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(5.0F);
        this.setCreativeTab(ManorLife.tabManorLife);
        BlockHandler.blocks.add(this);
        ItemHandler.items.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TEMill();
    }

    public void registerModel() {
        ManorLife.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
