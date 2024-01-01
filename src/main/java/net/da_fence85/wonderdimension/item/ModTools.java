package net.da_fence85.wonderdimension.item;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.tools.purewonder.*;
import net.da_fence85.wonderdimension.item.tools.wonder.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, WonderDimensionMod.MOD_ID);

    public static final RegistryObject<Item> WONDER_SWORD =
            TOOLS.register("wonder_sword", WonderSword::new);
    public static final RegistryObject<Item> WONDER_AXE =
            TOOLS.register("wonder_axe", WonderAxe::new);
    public static final RegistryObject<Item> WONDER_SHOVEL =
            TOOLS.register("wonder_shovel", WonderShovel::new);
    public static final RegistryObject<Item> WONDER_PICKAXE =
            TOOLS.register("wonder_pickaxe", WonderPickaxe::new);
    public static final RegistryObject<Item> WONDER_HOE =
            TOOLS.register("wonder_hoe", WonderHoe::new);

    public static final RegistryObject<Item> PURE_WONDER_SWORD =
            TOOLS.register("pure_wonder_sword", PureWonderSword::new);
    public static final RegistryObject<Item> PURE_WONDER_AXE =
            TOOLS.register("pure_wonder_axe", PureWonderAxe::new);
    public static final RegistryObject<Item> PURE_WONDER_SHOVEL =
            TOOLS.register("pure_wonder_shovel", PureWonderShovel::new);
    public static final RegistryObject<Item> PURE_WONDER_PICKAXE =
            TOOLS.register("pure_wonder_pickaxe", PureWonderPickaxe::new);
    public static final RegistryObject<Item> PURE_WONDER_HOE =
            TOOLS.register("pure_wonder_hoe", PureWonderHoe::new);

    public static void register(IEventBus eventBus) {
        TOOLS.register(eventBus);
    }
}
