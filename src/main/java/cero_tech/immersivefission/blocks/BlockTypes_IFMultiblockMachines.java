package cero_tech.immersivefission.blocks;

import blusunrize.immersiveengineering.common.blocks.BlockIEBase;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum BlockTypes_IFMultiblockMachines implements IStringSerializable, BlockIEBase.IBlockEnum {

    HEAT_EXCHANGER,
    PRESSURIZER,
    REACTOR_CHAMBER,
    TURBINE;

    @Override
    public int getMeta() {
        return ordinal();
    }

    @Override
    public boolean listForCreative() {
        return false;
    }

    @Override
    public String getName() {
        return this.toString().toLowerCase(Locale.ENGLISH);
    }
}
