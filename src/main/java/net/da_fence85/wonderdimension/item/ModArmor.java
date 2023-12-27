package net.da_fence85.wonderdimension.item;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.armor.wonder.WonderBoots;
import net.da_fence85.wonderdimension.item.armor.wonder.WonderChestplate;
import net.da_fence85.wonderdimension.item.armor.wonder.WonderHelmet;
import net.da_fence85.wonderdimension.item.armor.wonder.WonderLeggings;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArmor {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, WonderDimensionMod.MOD_ID);

    public static final RegistryObject<Item> WONDER_CHESTPLATE =
            ARMOR.register("wonder_chestplate", () -> new WonderChestplate());
    public static final RegistryObject<Item> WONDER_LEGGINGS =
            ARMOR.register("wonder_leggings", () -> new WonderLeggings());
    public static final RegistryObject<Item> WONDER_BOOTS =
            ARMOR.register("wonder_boots", () -> new WonderBoots());
    public static final RegistryObject<Item> WONDER_HELMET =
            ARMOR.register("wonder_helmet", () -> new WonderHelmet());


    public static void register(IEventBus eventBus) {
        ARMOR.register(eventBus);
    }
}
