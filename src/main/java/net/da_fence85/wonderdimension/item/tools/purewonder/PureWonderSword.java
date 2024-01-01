package net.da_fence85.wonderdimension.item.tools.purewonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PureWonderSword extends SwordItem {
    public PureWonderSword() {
        super(ModToolTiers.PURE_WONDER, 5, 2, new Item.Properties());
    }
}
