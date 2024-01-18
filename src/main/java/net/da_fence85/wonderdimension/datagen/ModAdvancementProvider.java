package net.da_fence85.wonderdimension.datagen;

import com.google.gson.JsonObject;
import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.ModItems;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.SerializationContext;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider provider, Consumer<Advancement> consumer, ExistingFileHelper existingFileHelper) {
        Advancement.Builder.advancement()
                .display(new ItemStack(ModItems.PURE_WONDER_GEM.get()), Component.translatable("advancement.wonderdimension.joined.title"),
                        Component.translatable("advancement.wonderdimension.joined.description"), null, FrameType.CHALLENGE,
                        true, true, false)
                .save(consumer, new ResourceLocation(WonderDimensionMod.MOD_ID, "misc/joined"), existingFileHelper);
    }
}
