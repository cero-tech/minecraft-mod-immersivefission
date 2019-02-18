package cero_tech.immersivefission.blocks.multiblocks;

import cero_tech.immersivefission.IFContent;
import cero_tech.immersivefission.blocks.BlockTypes_IFMultiblockMachines;
import cero_tech.immersivefission.blocks.multiblocks.structures.StructurePressurizer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class MultiblockPressurizer extends MultiblockBase {

    static {
        instance = new MultiblockPressurizer();
        name = "IF:Pressurizer";
        structure = StructurePressurizer.STRUCTURE;
        materials = materialsInStructure(structure);
    }

    @Override
    public void setRenderStack() {
        renderStack = new ItemStack(IFContent.blockMultiblockMachines, 1, BlockTypes_IFMultiblockMachines.PRESSURIZER.getMeta());
    }

    @Override
    public IBlockState getDefaultState() {
        return IFContent.blockMultiblockMachines.getStateFromMeta(BlockTypes_IFMultiblockMachines.PRESSURIZER.getMeta());
    }

    @Override
    public boolean isBlockTrigger(IBlockState state) {
        return ItemStack.areItemStacksEqual(StructurePressurizer.ORIGIN_BLOCK, new ItemStack(state.getBlock(), 1, state.getBlock().getMetaFromState(state)));
    }
}
