package net.da_fence85.wonderdimension.item;

import com.mojang.logging.LogUtils;
import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.basic.ImpureWonderGemItem;
import net.da_fence85.wonderdimension.item.basic.PortalKeyFragmentItem;
import net.da_fence85.wonderdimension.item.basic.PureWonderGemItem;
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
            ITEMS.register("wonder_gem", WonderGemItem::new);

    public static final RegistryObject<Item> IMPURE_WONDER_GEM =
            ITEMS.register("impure_wonder_gem", ImpureWonderGemItem::new);

    public static final RegistryObject<Item> PORTAL_KEY_FRAGMENT =
            ITEMS.register("portal_key_fragment", PortalKeyFragmentItem::new);

    public static final RegistryObject<Item> PURE_WONDER_GEM =
            ITEMS.register("pure_wonder_gem", PureWonderGemItem::new);

    /**
     * The method to register the items in this mod
     *
     * @param eventBus This is the event bus passed in to register the deferred register
     * */
    public static void register(IEventBus eventBus) {
        LogUtils.getLogger().info("Registering items for mod with ID: " + WonderDimensionMod.MOD_ID);
        ITEMS.register(eventBus);
    }

}
