package net.da_fence85.wonderdimension.util;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    /**
     * The tag class for block tags
     *
     * */
    public static class Blocks {
        public static final TagKey<Block> WONDER_BLOCKS = tag("wonder_blocks");

        /**
         * The method to create a new block tag
         *
         * @param name The name of the block tag
         * @return The tag key for that tag
         * */
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(WonderDimensionMod.MOD_ID, name));
        }
    }

    /**
     * The tag class for item tags
     *
     * */
    public static class Items {
        public static final TagKey<Item> WONDER_ITEM = tag("wonder_items");

        /**
         * The method to create a new item tag
         *
         * @param name The name of the item tag
         * @return The tag key for that tag
         * */
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(WonderDimensionMod.MOD_ID, name));
        }
    }
}
