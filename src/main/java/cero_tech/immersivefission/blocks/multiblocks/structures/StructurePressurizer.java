package cero_tech.immersivefission.blocks.multiblocks.structures;

import blusunrize.immersiveengineering.common.IEContent;
import blusunrize.immersiveengineering.common.blocks.BlockTypes_MetalsAll;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDecoration0;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDecoration1;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDevice0;
import net.minecraft.item.ItemStack;

public class StructurePressurizer {

    public static final int[] DIMENSIONS = {4, 4, 4};

    public static final ItemStack ORIGIN_BLOCK = new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta());

    // TODO: bounding box

    public static final ItemStack[][][] STRUCTURE = {
            { // y0
                    { // x0
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta())  // z3
                    },
                    { // x1
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta())  // z3
                    },
                    { // x2
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta())  // z3
                    },
                    { // x3
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration1, 1, BlockTypes_MetalDecoration1.STEEL_SCAFFOLDING_0.getMeta())  // z3
                    }
            },
            { // y1
                    { // x0
                            ItemStack.EMPTY, // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x1
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RS_ENGINEERING.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x2
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x3
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.LIGHT_ENGINEERING.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    }
            },
            { // y2
                    { // x0
                            ItemStack.EMPTY, // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x1
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x2
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x3
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.LIGHT_ENGINEERING.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    }
            },
            { // y3
                    { // x0
                            ItemStack.EMPTY, // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x1
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x2
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    },
                    { // x3
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.COIL_MV.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.LIGHT_ENGINEERING.getMeta()), // z2
                            ItemStack.EMPTY  // z3
                    }
            }
    };
}
