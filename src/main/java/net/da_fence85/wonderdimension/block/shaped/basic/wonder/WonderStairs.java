package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

public class WonderStairs extends StairBlock {
    public WonderStairs() {
        super(() -> ModBlocks.WONDER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()));
    }
}
