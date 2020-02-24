package com.gonggongjohn.manorlife.blocks;

import com.gonggongjohn.manorlife.ManorLife;
import com.gonggongjohn.manorlife.handlers.BlockHandler;
import com.gonggongjohn.manorlife.handlers.ItemHandler;
import com.gonggongjohn.manorlife.tile.TEStoneMill;
import com.gonggongjohn.manorlife.utils.IHasModel;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILockableContainer;
import net.minecraft.world.World;
import javax.annotation.Nullable;

public class BlockStoneMill extends BlockContainer implements IHasModel {
	
    public final String name = "stone_mill";
    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BlockStoneMill() {
    	
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

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
    	
        return new TEStoneMill();
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote) {

        	ILockableContainer ilockablecontainer = this.getLockableContainer(worldIn, pos);

            playerIn.displayGUIChest(ilockablecontainer);
        }
        return true;
    }

    @Nullable
    public ILockableContainer getLockableContainer(World worldIn, BlockPos pos) {
    	
        return this.getContainer(worldIn, pos, false);
    }
    
    @Nullable
    private ILockableContainer getContainer(World worldIn, BlockPos pos, boolean b) {

        TileEntity tileentity = worldIn.getTileEntity(pos);
        
        if (!(tileentity instanceof TEStoneMill)) {
        	
            return null;
        }
        else {

            ILockableContainer ilockablecontainer = (TEStoneMill)tileentity;

            TileEntity anothorTileEntity = worldIn.getTileEntity(pos);
            ilockablecontainer = new InventoryLargeChest("", ilockablecontainer, (TEStoneMill)anothorTileEntity);
            return ilockablecontainer;
        }
	}

	public void registerModel() {
    	
        ManorLife.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}
}
