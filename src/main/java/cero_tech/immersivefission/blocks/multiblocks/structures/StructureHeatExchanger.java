package cero_tech.immersivefission.blocks.multiblocks.structures;

import blusunrize.immersiveengineering.common.IEContent;
import blusunrize.immersiveengineering.common.blocks.BlockTypes_MetalsAll;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDecoration0;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDevice0;
import blusunrize.immersiveengineering.common.blocks.metal.BlockTypes_MetalDevice1;
import blusunrize.immersiveengineering.common.blocks.wooden.BlockTypes_WoodenDecoration;
import net.minecraft.item.ItemStack;

public class StructureHeatExchanger {

    public static final int[] DIMENSIONS = {7, 5, 5};

    public static final ItemStack ORIGIN_BLOCK = new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta());

    // TODO: bounding box

    public static final ItemStack[][][] STRUCTURE = {
            { // y0
                    { // x0
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()), // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY, // z3
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()) // z4
                    },
                    { // x1
                            ItemStack.EMPTY, // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY, // z3
                            ItemStack.EMPTY // z4
                    },
                    { // x2
                            ItemStack.EMPTY, // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY, // z3
                            ItemStack.EMPTY // z4
                    },
                    { // x3
                            ItemStack.EMPTY, // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY, // z3
                            ItemStack.EMPTY // z4
                    },
                    { // x4
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()), // z0
                            ItemStack.EMPTY, // z1
                            ItemStack.EMPTY, // z2
                            ItemStack.EMPTY, // z3
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()) // z4
                    }
            },
            { // y1
                    { // x0
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()) // z4
                    },
                    { // x1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x2
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x4
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockWoodenDecoration, 1, BlockTypes_WoodenDecoration.FENCE.getMeta()) // z4
                    }
            },
            { // y2
                    { // x0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x4
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    }
            },
            { // y3
                    { // x0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x4
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    }
            },
            { // y4
                    { // x0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x4
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    }
            },
            { // y5
                    { // x0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDevice1, 1, BlockTypes_MetalDevice1.FLUID_PIPE.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z1
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDecoration0, 1, BlockTypes_MetalDecoration0.RADIATOR.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x4
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    }
            },
            { // y6
                    { // x0
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            ItemStack.EMPTY // z4
                    },
                    { // x1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x2
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockMetalDevice0, 1, BlockTypes_MetalDevice0.BARREL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z0
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetal, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()) // z4
                    },
                    { // x4
                            ItemStack.EMPTY, // z0
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z1
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z2
                            new ItemStack(IEContent.blockSheetmetalSlabs, 1, BlockTypes_MetalsAll.STEEL.getMeta()), // z3
                            ItemStack.EMPTY // z4
                    }
            }
    };
}
