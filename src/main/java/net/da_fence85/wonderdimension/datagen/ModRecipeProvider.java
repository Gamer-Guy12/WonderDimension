package net.da_fence85.wonderdimension.datagen;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.block.ModBlocks;
import net.da_fence85.wonderdimension.item.ModArmor;
import net.da_fence85.wonderdimension.item.ModItems;
import net.da_fence85.wonderdimension.item.ModTools;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreBlasting(consumer, List.of(ModItems.IMPURE_WONDER_GEM.get()), RecipeCategory.MISC, ModItems.WONDER_GEM.get(), 10f, 800, "wonder_gem");
        oreSmelting(consumer, List.of(ModItems.IMPURE_WONDER_GEM.get()), RecipeCategory.MISC, ModItems.WONDER_GEM.get(), 10f, 1000, "wonder_gem");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WONDER_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.WONDER_GEM.get())
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WONDER_GEM.get(), 9)
                .requires(ModBlocks.WONDER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.WONDER_BLOCK.get()), has(ModBlocks.WONDER_BLOCK.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModArmor.WONDER_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.WONDER_GEM.get())
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModArmor.WONDER_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.WONDER_GEM.get())
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModArmor.WONDER_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.WONDER_GEM.get())
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModArmor.WONDER_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.WONDER_GEM.get())
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModTools.WONDER_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("@")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModTools.WONDER_AXE.get())
                .pattern("##")
                .pattern("#@")
                .pattern(" @")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer, new ResourceLocation(WonderDimensionMod.MOD_ID, "wonder_axe_left_recipe"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModTools.WONDER_AXE.get())
                .pattern("##")
                .pattern("@#")
                .pattern("@ ")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer, new ResourceLocation(WonderDimensionMod.MOD_ID, "wonder_axe_right_recipe"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModTools.WONDER_PICKAXE.get())
                .pattern("###")
                .pattern(" @ ")
                .pattern(" @ ")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModTools.WONDER_SHOVEL.get())
                .pattern("#")
                .pattern("@")
                .pattern("@")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModTools.WONDER_HOE.get())
                .pattern("##")
                .pattern(" @")
                .pattern(" @")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer, new ResourceLocation(WonderDimensionMod.MOD_ID, "wonder_hoe_left_recipe"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModTools.WONDER_HOE.get())
                .pattern("##")
                .pattern("@ ")
                .pattern("@ ")
                .define('#', ModItems.WONDER_GEM.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.WONDER_GEM.get()), has(ModItems.WONDER_GEM.get()))
                .save(consumer, new ResourceLocation(WonderDimensionMod.MOD_ID, "wonder_hoe_right_recipe"));
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  WonderDimensionMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
