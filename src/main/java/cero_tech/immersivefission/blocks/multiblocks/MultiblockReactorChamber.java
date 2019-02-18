package cero_tech.immersivefission.blocks.multiblocks;

import cero_tech.immersivefission.IFContent;
import cero_tech.immersivefission.blocks.BlockTypes_IFMultiblockMachines;
import cero_tech.immersivefission.blocks.multiblocks.structures.StructureReactorChamber;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class MultiblockReactorChamber extends MultiblockBase {

    static {
        instance = new MultiblockReactorChamber();
        name = "IF:ReactorChamber";
        structure = StructureReactorChamber.STRUCTURE;
        materials = materialsInStructure(structure);
    }

    @Override
    public void setRenderStack() {
        renderStack = new ItemStack(IFContent.blockMultiblockMachines, 1, BlockTypes_IFMultiblockMachines.REACTOR_CHAMBER.getMeta());
    }

    @Override
    public IBlockState getDefaultState() {
        return IFContent.blockMultiblockMachines.getStateFromMeta(BlockTypes_IFMultiblockMachines.REACTOR_CHAMBER.getMeta());
    }

    @Override
    public boolean isBlockTrigger(IBlockState state) {
        return ItemStack.areItemStacksEqual(StructureReactorChamber.ORIGIN_BLOCK, new ItemStack(state.getBlock(), 1, state.getBlock().getMetaFromState(state)));
    }
}
