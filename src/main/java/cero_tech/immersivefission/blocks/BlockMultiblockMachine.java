package cero_tech.immersivefission.blocks;

import blusunrize.immersiveengineering.api.IEProperties;
import blusunrize.immersiveengineering.common.blocks.BlockIEMultiblock;
import blusunrize.immersiveengineering.common.blocks.ItemBlockIEBase;
import cero_tech.immersivefission.ImmersiveFission;
import cero_tech.immersivefission.tileentities.*;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.property.Properties;

import javax.annotation.Nullable;

public class BlockMultiblockMachine extends BlockIEMultiblock<BlockTypes_IFMultiblockMachines> {

    public BlockMultiblockMachine() {
        super("machine_multiblock", Material.IRON, PropertyEnum.create("type", BlockTypes_IFMultiblockMachines.class), ItemBlockIEBase.class, IEProperties.DYNAMICRENDER, IEProperties.BOOLEANS[0], Properties.AnimationProperty, IEProperties.OBJ_TEXTURE_REMAP);
        setHardness(3.0F);
        setResistance(15.0F);
        lightOpacity = 0;
    }

    @Override
    public String createRegistryName() {
        return ImmersiveFission.MODID + ":" + name;
    }

    @Override
    public EnumPushReaction getPushReaction(IBlockState state) {
        return EnumPushReaction.BLOCK;
    }

    @Override
    public boolean allowHammerHarvest(IBlockState blockState) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createBasicTE(World worldIn, BlockTypes_IFMultiblockMachines type) {
        switch (type) {
            case HEAT_EXCHANGER:
                return new TileEntityHeatExchanger();
            case PRESSURIZER:
                return new TileEntityPressurizer();
            case REACTOR_CHAMBER:
                return new TileEntityReactorChamber();
            case TURBINE:
                return new TileEntityTurbine();
        }
        return null;
    }
}
