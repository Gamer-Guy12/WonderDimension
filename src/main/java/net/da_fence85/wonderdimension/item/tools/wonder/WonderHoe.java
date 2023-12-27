package net.da_fence85.wonderdimension.item.tools.wonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class WonderHoe extends HoeItem {
    public WonderHoe() {
        super(ModToolTiers.WONDER, -3, 6, new Item.Properties());
    }
}
