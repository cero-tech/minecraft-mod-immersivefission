package cero_tech.immersivefission.blocks.multiblocks;

import blusunrize.immersiveengineering.api.ApiUtils;
import blusunrize.immersiveengineering.api.IEProperties;
import blusunrize.immersiveengineering.api.MultiblockHandler.IMultiblock;
import blusunrize.immersiveengineering.api.crafting.IngredientStack;
import blusunrize.immersiveengineering.client.ClientUtils;
import blusunrize.immersiveengineering.common.blocks.TileEntityMultiblockPart;
import blusunrize.immersiveengineering.common.util.Utils;
import cero_tech.immersivefission.IFContent;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiblockBase implements IMultiblock {

    public static MultiblockBase instance;
    static String name;
    static ItemStack[][][] structure;
    static IngredientStack[] materials;
    static ItemStack renderStack = ItemStack.EMPTY;

    public abstract void setRenderStack();

    public abstract IBlockState getDefaultState();

    @Override
    public abstract boolean isBlockTrigger(IBlockState state);

    @Override
    public String getUniqueName() {
        return name;
    }

    @Override
    public ItemStack[][][] getStructureManual() {
        return structure;
    }

    @Override
    public IngredientStack[] getTotalMaterials() {
        return materials;
    }

    @Override
    public boolean overwriteBlockRender(ItemStack stack, int iterator) {
        return true;
    }

    @Override
    public float getManualScale() {
        return 8;
    }

    @Override
    public boolean canRenderFormedStructure() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void renderFormedStructure() {
        if(renderStack.isEmpty()) setRenderStack();
        GlStateManager.translate(structure[0].length / 2.0, structure.length / 2.0, structure[0][0].length / 2.0);
        GlStateManager.rotate(-45, 0, 1, 0);
        GlStateManager.rotate(-20, 1, 0, 0);
        GlStateManager.scale(5, 5, 5);
        GlStateManager.disableCull();
        ClientUtils.mc().getRenderItem().renderItem(renderStack, ItemCameraTransforms.TransformType.GUI);
        GlStateManager.enableCull();
    }

    @Override
    public boolean createStructure(World world, BlockPos pos, EnumFacing side, EntityPlayer player) {
        if(side == EnumFacing.UP || side == EnumFacing.DOWN) {
            side = EnumFacing.fromAngle(player.rotationYaw);
        }
        side = side.getOpposite();

        if (isValidStructure(world, pos, side)) {
            IBlockState state = getDefaultState();
            state = state.withProperty(IEProperties.FACING_HORIZONTAL, side);

            for (int h = 0; h < structure.length; h++) {
                for (int l = 0; l < structure[h].length; l++) {
                    for (int w = 0; w < structure[h][l].length; w++) {
                        BlockPos currentPos = pos.offset(side, l).offset(side.rotateY(), w).add(0, h, 0);
                        world.setBlockState(currentPos, state);

                        TileEntity te = world.getTileEntity(currentPos);
                        if (te instanceof TileEntityMultiblockPart) {
                            TileEntityMultiblockPart tile = (TileEntityMultiblockPart) te;
                            tile.formed = true;
                            tile.pos = (h * (structure[h].length * structure[h][l].length)) + (l * structure[h].length) + w;
                            tile.offset = new int[] {
                                    side == EnumFacing.EAST ? 1: side == EnumFacing.WEST ? -1: side == EnumFacing.NORTH ? -w: w,
                                    h,
                                    side == EnumFacing.NORTH ? 1: side == EnumFacing.SOUTH ? -1: side == EnumFacing.EAST ? -w: w
                            };
                            tile.markDirty();
                            world.addBlockEvent(currentPos, IFContent.blockMultiblockMachines, 255, 0);
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidStructure(World world, BlockPos startPos, EnumFacing facing) {
        for (int h = 0; h < structure.length; h++) {
            for (int l = 0; l < structure[h].length; l++) {
                for (int w = 0; w < structure[h][l].length; w++) {
                    if (!structure[h][l][w].isEmpty()) {
                        BlockPos pos = startPos.offset(facing, l).offset(facing.rotateY(), w).add(0, h, 0);
                        if (!Utils.isBlockAt(world, pos, Block.getBlockFromItem(structure[h][l][w].getItem()), structure[h][l][w].getMetadata())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static IngredientStack[] materialsInStructure(ItemStack[][][] structure) {
        List<ItemStack> ingredients = new ArrayList<>();

        for (int h = 0; h < structure.length; h++) {
            for (int l = 0; l < structure[0].length; l++) {
                for (int w = 0; w < structure[0][0].length; w++) {
                    if (ingredients.contains(structure[h][l][w])) {
                        ItemStack stack = ingredients.get(ingredients.indexOf(structure[h][l][w]));
                        stack.setCount(stack.getCount() + 1);
                    } else {
                        ingredients.add(structure[h][l][w]);
                    }
                }
            }
        }

        return new IngredientStack[] {ApiUtils.createIngredientStack(ingredients)};
    }
}
