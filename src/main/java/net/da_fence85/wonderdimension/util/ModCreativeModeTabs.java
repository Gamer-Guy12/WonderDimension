package net.da_fence85.wonderdimension.util;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.block.ModBlocks;
import net.da_fence85.wonderdimension.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * The creative mode tabs for this mod
 *
 * */
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WonderDimensionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WONDER_TAB =
            TABS.register("wonder_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.WONDER_GEM.get()))
                    .title(Component.translatable("creativetab.wonderdimension.wonder_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        ModItems.ITEMS.getEntries().forEach((item) -> {
                            pOutput.accept(item.get());
                        });

                        ModBlocks.BLOCKS.getEntries().forEach((block) -> {
                            pOutput.accept(block.get());
                        });
                    })
                    .build());

    /**
     * The function to register the creative mode tabs
     *
     * */
    public static void register (IEventBus eventBus) {
        TABS.register(eventBus);
    }

}
