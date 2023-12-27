package net.da_fence85.wonderdimension.item.tools.wonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class WonderSword extends SwordItem {
    public WonderSword() {
        super(ModToolTiers.WONDER, 5, 2, new Item.Properties());
    }
}
