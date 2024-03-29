package net.da_fence85.wonderdimension.datagen;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.block.ModBlocks;
import net.da_fence85.wonderdimension.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WonderDimensionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        ModBlocks.BLOCKS.getEntries().forEach(block -> {
            this.tag(ModTags.Blocks.WONDER_BLOCKS).add(block.get());
        });

        this.tag(Tags.Blocks.ORES)
                .add(ModBlocks.WONDER_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.WONDER_BLOCK.get(), ModBlocks.WONDER_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_WONDER_TOOL)
                .add(ModBlocks.PURE_WONDER_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WONDER_BLOCK.get(), ModBlocks.WONDER_ORE.get(),
                        ModBlocks.PURE_WONDER_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.WONDER_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WONDER_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.WONDER_WALL.get());
    }
}
