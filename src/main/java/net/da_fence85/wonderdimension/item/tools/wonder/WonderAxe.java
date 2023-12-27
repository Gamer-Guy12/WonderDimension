package net.da_fence85.wonderdimension.item.tools.wonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class WonderAxe extends AxeItem {
    public WonderAxe() {
        super(ModToolTiers.WONDER, 7, 1, new Item.Properties());
    }
}
