package net.da_fence85.wonderdimension.item;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.basic.WonderGemItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 *
 * This is the class that declares all the items in this mod
 * */
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WonderDimensionMod.MOD_ID);

    public static final RegistryObject<Item> WONDER_GEM =
            ITEMS.register("wonder_gem", () -> new WonderGemItem());

    /**
     * The method to register the items in this mod
     *
     * @param eventBus This is the event bus passed in to register the deferred register
     * */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
