package net.da_fence85.wonderdimension.block;


import com.mojang.logging.LogUtils;
import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.block.basic.WonderBlockBlock;
import net.da_fence85.wonderdimension.block.basic.WonderOreBlock;
import net.da_fence85.wonderdimension.block.shaped.basic.*;
import net.da_fence85.wonderdimension.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 *
 * The class to register all the blocks in this mod
 *
 */
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WonderDimensionMod.MOD_ID);

    public static final RegistryObject<Block> WONDER_BLOCK = registerBlock("wonder_block",
            WonderBlockBlock::new);

    public static final RegistryObject<Block> WONDER_ORE = registerBlock("wonder_ore",
            WonderOreBlock::new);

    public static final RegistryObject<Block> WONDER_BUTTON = registerBlock("wonder_button",
            WonderButton::new);

    public static final RegistryObject<Block> WONDER_DOOR = registerBlock("wonder_door",
            WonderDoor::new);

    public static final RegistryObject<Block> WONDER_FENCE = registerBlock("wonder_fence",
            WonderFence::new);

    public static final RegistryObject<Block> WONDER_FENCE_GATE = registerBlock("wonder_fence_gate",
            WonderFenceGate::new);

    public static final RegistryObject<Block> WONDER_PRESSURE_PLATE = registerBlock("wonder_pressure_plate",
            WonderPressurePlate::new);

    public static final RegistryObject<Block> WONDER_SLAB = registerBlock("wonder_slab",
            WonderSlab::new);

    public static final RegistryObject<Block> WONDER_STAIRS = registerBlock("wonder_stairs",
            WonderStairs::new);

    public static final RegistryObject<Block> WONDER_TRAP_DOOR = registerBlock("wonder_trap_door",
            WonderTrapDoor::new);

    public static final RegistryObject<Block> WONDER_WALL = registerBlock("wonder_wall",
            WonderWall::new);

    /**
     * This function registers a block and creates its item
     *
     * @param name The name of the block
     * @param block The supplier that gives you the block
     *
     * @return The registry object of the block that was created
     *
     * */
    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    /**
     * The method to create an item when making a block
     *
     * @param name The name of the item
     * @param block The block that the item is created for
     *
     * @return The Item registry object for that block
     * */
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    /**
     *
     * The function to register the block deferred register
     *
     * @param eventBus The event bus for the deferred register
     *
     * */
    public static void register(IEventBus eventBus) {
        LogUtils.getLogger().info("Registering blocks for mod with ID: " + WonderDimensionMod.MOD_ID);
        BLOCKS.register(eventBus);
    }

}
