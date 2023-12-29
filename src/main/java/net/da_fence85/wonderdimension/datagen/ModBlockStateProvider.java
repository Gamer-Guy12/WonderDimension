package net.da_fence85.wonderdimension.datagen;

import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WonderDimensionMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.WONDER_BLOCK);
        blockWithItem(ModBlocks.WONDER_ORE);

        stairsBlock((StairBlock) ModBlocks.WONDER_STAIRS.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.WONDER_SLAB.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()), blockTexture(ModBlocks.WONDER_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.WONDER_BUTTON.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WONDER_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()));

        fenceBlock((FenceBlock) ModBlocks.WONDER_FENCE.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WONDER_FENCE_GATE.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.WONDER_WALL.get(), blockTexture(ModBlocks.WONDER_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.WONDER_DOOR.get()), modLoc("block/wonder_door_bottom"), modLoc("block/wonder_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WONDER_TRAP_DOOR.get()), modLoc("block/wonder_trap_door"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
