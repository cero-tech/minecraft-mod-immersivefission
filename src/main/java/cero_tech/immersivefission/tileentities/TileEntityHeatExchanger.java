package cero_tech.immersivefission.tileentities;

import blusunrize.immersiveengineering.api.ApiUtils;
import blusunrize.immersiveengineering.common.blocks.TileEntityMultiblockPart;
import cero_tech.immersivefission.blocks.multiblocks.MultiblockHeatExchanger;
import cero_tech.immersivefission.blocks.multiblocks.structures.StructureHeatExchanger;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.IFluidTank;

import javax.annotation.Nonnull;

public class TileEntityHeatExchanger extends TileEntityMultiblockPart<TileEntityHeatExchanger> {

    public TileEntityHeatExchanger() {
        super(StructureHeatExchanger.DIMENSIONS);
    }

    @Nonnull
    @Override
    protected IFluidTank[] getAccessibleFluidTanks(EnumFacing side) {
        // TODO
        return new IFluidTank[0];
    }

    @Override
    protected boolean canFillTankFrom(int iTank, EnumFacing side, FluidStack resource) {
        // TODO
        return false;
    }

    @Override
    protected boolean canDrainTankFrom(int iTank, EnumFacing side) {
        // TODO
        return false;
    }

    @Override
    public ItemStack getOriginalBlock() {
        if(pos < 0)
            return ItemStack.EMPTY;
        ItemStack stack = ItemStack.EMPTY;
        try
        {
            int blocksPerLevel = StructureHeatExchanger.DIMENSIONS[1] * StructureHeatExchanger.DIMENSIONS[2];
            int h = (pos / blocksPerLevel);
            int l = (pos % blocksPerLevel / StructureHeatExchanger.DIMENSIONS[2]);
            int w = (pos % StructureHeatExchanger.DIMENSIONS[2]);
            stack = MultiblockHeatExchanger.instance.getStructureManual()[h][l][w];
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        return stack.copy();
    }

    @Override
    public float[] getBlockBounds() {
        // TODO
        return new float[0];
    }

    @Override
    public void update() {
        ApiUtils.checkForNeedlessTicking(this);

        // TODO
    }
}
