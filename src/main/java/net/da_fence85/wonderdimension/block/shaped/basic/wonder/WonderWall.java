package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WonderWall extends WallBlock {
    public WonderWall() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()));
    }
}
