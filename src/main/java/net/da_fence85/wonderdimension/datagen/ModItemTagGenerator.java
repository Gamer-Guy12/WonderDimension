package net.da_fence85.wonderdimension.datagen;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.ModArmor;
import net.da_fence85.wonderdimension.item.ModItems;
import net.da_fence85.wonderdimension.item.ModTools;
import net.da_fence85.wonderdimension.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, WonderDimensionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        ModItems.ITEMS.getEntries().forEach(item -> {
            this.tag(ModTags.Items.WONDER_ITEM).add(item.get());
        });

        ModTools.TOOLS.getEntries().forEach(tool -> {
            this.tag(ModTags.Items.WONDER_ITEM).add(tool.get());
        });

        ModArmor.ARMOR.getEntries().forEach(armor -> {
            this.tag(ModTags.Items.WONDER_ITEM).add(armor.get());
        });

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModArmor.WONDER_BOOTS.get())
                .add(ModArmor.WONDER_CHESTPLATE.get())
                .add(ModArmor.WONDER_LEGGINGS.get())
                .add(ModArmor.WONDER_BOOTS.get());
    }
}
