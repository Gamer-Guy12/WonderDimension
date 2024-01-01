package net.da_fence85.wonderdimension.item;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

/**
 * The class to register tool tiers for this mod
 *
 * */
public class ModToolTiers {
    public static final Tier WONDER = TierSortingRegistry.registerTier(
        new ForgeTier(10, 5000, 13f, 6f, 40, ModTags.Blocks.NEEDS_WONDER_TOOL,
                () -> Ingredient.of(ModItems.WONDER_GEM.get())),
            new ResourceLocation(WonderDimensionMod.MOD_ID, "wonder_gem"),
            List.of(Tiers.NETHERITE), List.of()
    );

    public static final Tier PURE_WONDER = TierSortingRegistry.registerTier(
        new ForgeTier(15, 7500, 15f, 8f, 50, ModTags.Blocks.NEEDS_PURE_WONDER_TOOL,
              () -> Ingredient.of(ModItems.PURE_WONDER_GEM.get())),
        new ResourceLocation(WonderDimensionMod.MOD_ID, "pure_wonder_gem"),
        List.of(ModToolTiers.WONDER), List.of()
    );
}
