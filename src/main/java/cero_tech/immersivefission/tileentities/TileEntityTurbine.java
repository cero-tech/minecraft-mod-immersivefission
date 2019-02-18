package cero_tech.immersivefission.tileentities;

import blusunrize.immersiveengineering.api.ApiUtils;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IComparatorOverride;
import blusunrize.immersiveengineering.common.blocks.TileEntityMultiblockPart;
import cero_tech.immersivefission.blocks.multiblocks.structures.StructureTurbine;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;

import javax.annotation.Nonnull;

public class TileEntityTurbine extends TileEntityMultiblockPart<TileEntityTurbine> implements IComparatorOverride {

    public TileEntityTurbine() {
        super(StructureTurbine.DIMENSIONS);
    }

    @Override
    public int getComparatorInputOverride() {
        // TODO
        return 0;
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
        // TODO
        return null;
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
