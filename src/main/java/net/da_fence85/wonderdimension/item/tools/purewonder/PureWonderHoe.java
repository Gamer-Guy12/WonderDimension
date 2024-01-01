package net.da_fence85.wonderdimension.item.tools.purewonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class PureWonderHoe extends HoeItem {
    public PureWonderHoe() {
        super(ModToolTiers.PURE_WONDER, -3, 6, new Item.Properties());
    }
}
