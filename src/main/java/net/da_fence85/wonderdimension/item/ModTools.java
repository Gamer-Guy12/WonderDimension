package net.da_fence85.wonderdimension.item;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.tools.wonder.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, WonderDimensionMod.MOD_ID);

    public static final RegistryObject<Item> WONDER_SWORD =
            TOOLS.register("wonder_sword", () -> new WonderSword());
    public static final RegistryObject<Item> WONDER_AXE =
            TOOLS.register("wonder_axe", () -> new WonderAxe());
    public static final RegistryObject<Item> WONDER_SHOVEL =
            TOOLS.register("wonder_shovel", () -> new WonderShovel());
    public static final RegistryObject<Item> WONDER_PICKAXE =
            TOOLS.register("wonder_pickaxe", () -> new WonderPickaxe());
    public static final RegistryObject<Item> WONDER_HOE =
            TOOLS.register("wonder_hoe", () -> new WonderHoe());

    public static void register(IEventBus eventBus) {
        TOOLS.register(eventBus);
    }
}
