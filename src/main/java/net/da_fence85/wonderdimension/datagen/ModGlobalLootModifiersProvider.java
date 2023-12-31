package net.da_fence85.wonderdimension.datagen;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.ModItems;
import net.da_fence85.wonderdimension.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, WonderDimensionMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("portal_key_fragment_from_zombie", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                        LootItemRandomChanceCondition.randomChance(0.005f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));

        add("portal_key_fragment_from_skeleton", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build(),
                        LootItemRandomChanceCondition.randomChance(0.007f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_spider", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build(),
                        LootItemRandomChanceCondition.randomChance(0.003f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_creeper", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.008f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_woodland_mansion", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                        LootItemRandomChanceCondition.randomChance(0.015f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_pillager_outpost", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build(),
                        LootItemRandomChanceCondition.randomChance(0.01f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_cartographer_gift", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("gameplay/hero_of_the_village/cartographer_gift")).build(),
                        LootItemRandomChanceCondition.randomChance(0.02f).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_sus_sand_desert_pyramid", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_sus_sand_desert_well", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_well")).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_sus_sand_ocean_ruin_cold", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("archaeology/ocean_ruin_cold")).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_sus_sand_ocean_ruin_warm", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("archaeology/ocean_ruin_warm")).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_sus_sand_trail_ruins_rare", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("archaeology/trail_ruins_rare")).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
        add("portal_key_fragment_from_sus_sand_trail_ruins_common", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(new ResourceLocation("archaeology/trail_ruins_common")).build()
                },
                ModItems.PORTAL_KEY_FRAGMENT.get()
        ));
    }
}
