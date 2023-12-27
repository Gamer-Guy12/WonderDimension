package net.da_fence85.wonderdimension.item.tools.wonder;

import net.da_fence85.wonderdimension.item.ModToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class WonderPickaxe extends PickaxeItem {
    public WonderPickaxe() {
        super(ModToolTiers.WONDER, 4, -1, new Item.Properties());
    }
}
