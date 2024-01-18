package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WonderSlab extends SlabBlock {
    public WonderSlab() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()));
    }
}
