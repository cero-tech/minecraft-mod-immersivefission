package cero_tech.immersivefission.items;

import blusunrize.immersiveengineering.common.items.ItemIEBase;
import cero_tech.immersivefission.ImmersiveFission;

public class ItemIFBase extends ItemIEBase {

    public ItemIFBase(String name, int stackSize, int damage) {
        super(name, stackSize);
        setTranslationKey(ImmersiveFission.MODID + "." + name);
        setMaxDamage(damage);
    }
}
