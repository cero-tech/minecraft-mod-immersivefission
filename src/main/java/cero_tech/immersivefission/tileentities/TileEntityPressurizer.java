package cero_tech.immersivefission.tileentities;

import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IAdvancedCollisionBounds;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IAdvancedSelectionBounds;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IGuiTile;
import blusunrize.immersiveengineering.common.blocks.metal.TileEntityMultiblockMetal;
import cero_tech.immersivefission.IFConfig;
import cero_tech.immersivefission.blocks.multiblocks.MultiblockPressurizer;
import cero_tech.immersivefission.blocks.multiblocks.structures.StructurePressurizer;
import cero_tech.immersivefission.recipes.RecipePressurizer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.IFluidTank;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class TileEntityPressurizer extends TileEntityMultiblockMetal<TileEntityPressurizer, RecipePressurizer> implements IGuiTile, IAdvancedSelectionBounds, IAdvancedCollisionBounds {

    private FluidTank fluidTank = new FluidTank(IFConfig.ConfigPressurizer.fluidCapacity * 1000);
    private int tickCount = 0;
    private RecipePressurizer currentRecipe = null;

    public TileEntityPressurizer() {
        super(MultiblockPressurizer.instance, StructurePressurizer.DIMENSIONS, IFConfig.ConfigPressurizer.energyCapacity, true);
    }

    private boolean canRun() {
        return energyStorage.getEnergyStored() >= IFConfig.ConfigPressurizer.energyUsage &&
                RecipePressurizer.findRecipeByInput(fluidTank.getFluid()) != null;
    }

    @Nonnull
    @Override
    protected IFluidTank[] getAccessibleFluidTanks(EnumFacing side) {
        return side == facing || side == facing.getOpposite() ? new IFluidTank[] {fluidTank}: new IFluidTank[0];
    }

    @Override
    protected boolean canFillTankFrom(int iTank, EnumFacing side, FluidStack resource) {
        return side == facing && RecipePressurizer.findRecipeByInput(resource) != null;
    }

    @Override
    protected boolean canDrainTankFrom(int iTank, EnumFacing side) {
        return side == facing.getOpposite();
    }

    @Override
    protected RecipePressurizer readRecipeFromNBT(NBTTagCompound tag) {
        return RecipePressurizer.readFromNBT(tag);
    }

    @Override
    public int[] getEnergyPos() {
        // TODO
        return new int[0];
    }

    @Override
    public int[] getRedstonePos() {
        // TODO
        return new int[0];
    }

    @Override
    public ItemStack getOriginalBlock() {
        if(pos < 0)
            return ItemStack.EMPTY;
        ItemStack stack = ItemStack.EMPTY;
        try
        {
            int blocksPerLevel = StructurePressurizer.DIMENSIONS[1] * StructurePressurizer.DIMENSIONS[2];
            int h = (pos / blocksPerLevel);
            int l = (pos % blocksPerLevel / StructurePressurizer.DIMENSIONS[2]);
            int w = (pos % StructurePressurizer.DIMENSIONS[2]);
            stack = MultiblockPressurizer.instance.getStructureManual()[h][l][w];
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
        super.update();

        if (canRun()) {

            if (tickCount == 0) {
                currentRecipe = RecipePressurizer.findRecipeByInput(fluidTank.getFluid());
            }

            energyStorage.extractEnergy(IFConfig.ConfigPressurizer.energyUsage, false);
            tickCount++;

            if (tickCount >= currentRecipe.ticks) {
                fluidTank.setFluid(currentRecipe.output);
                currentRecipe = null;
                tickCount = 0;
                markDirty();
            }
        }
    }

    @Override
    public IFluidTank[] getInternalTanks() {
        return new IFluidTank[] {fluidTank};
    }

    @Override
    public int[] getOutputTanks() {
        // TODO
        return new int[0];
    }

    @Override
    public boolean additionalCanProcessCheck(MultiblockProcess<RecipePressurizer> process) {
        // TODO
        return false;
    }

    @Override
    public void doProcessFluidOutput(FluidStack output) {
        // TODO
    }

    @Override
    public void onProcessFinish(MultiblockProcess<RecipePressurizer> process) {
        // TODO
    }

    @Override
    public int getMaxProcessPerTick() {
        // TODO
        return 0;
    }

    @Override
    public int getProcessQueueMaxLength() {
        // TODO
        return 0;
    }

    @Override
    public float getMinProcessDistance(MultiblockProcess<RecipePressurizer> process) {
        // TODO
        return 0;
    }

    @Override
    public List<AxisAlignedBB> getAdvancedColisionBounds() {
        // TODO
        return null;
    }

    @Override
    public List<AxisAlignedBB> getAdvancedSelectionBounds() {
        // TODO
        return null;
    }

    @Override
    public boolean isOverrideBox(AxisAlignedBB box, EntityPlayer player, RayTraceResult mop, ArrayList<AxisAlignedBB> list) {
        // TODO
        return false;
    }

    @Override
    public boolean canOpenGui() {
        // TODO
        return false;
    }

    @Override
    public int getGuiID() {
        // TODO
        return 0;
    }

    @Nullable
    @Override
    public TileEntity getGuiMaster() {
        // TODO
        return null;
    }

    @Override
    public void doGraphicalUpdates(int slot) {
        // TODO
    }

    @Override
    public boolean isInWorldProcessingMachine() {
        return false;
    }

    // Not used due to lack of inventory

    @Override
    public RecipePressurizer findRecipeForInsertion(ItemStack inserting) {
        return null;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    public void doProcessOutput(ItemStack output) {}

    @Override
    public NonNullList<ItemStack> getInventory() {
        return null;
    }

    @Override
    public boolean isStackValid(int slot, ItemStack stack) {
        return false;
    }

    @Override
    public int getSlotLimit(int slot) {
        return 0;
    }
}
