package net.da_fence85.wonderdimension.item.armor.wonder;

import net.da_fence85.wonderdimension.item.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class WonderChestplate extends ArmorItem {
    public WonderChestplate() {
        super(ModArmorMaterials.WONDER, Type.CHESTPLATE, new Item.Properties());
    }
}
