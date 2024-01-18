package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WonderFence extends FenceBlock {
    public WonderFence() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()));
    }
}
