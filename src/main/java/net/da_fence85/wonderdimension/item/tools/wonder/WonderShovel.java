package net.da_fence85.wonderdimension.item.tools.wonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class WonderShovel extends ShovelItem {
    public WonderShovel() {
        super(ModToolTiers.WONDER, 2, -2, new Item.Properties());
    }
}
