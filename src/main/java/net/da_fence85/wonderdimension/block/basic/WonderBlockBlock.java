package net.da_fence85.wonderdimension.block.basic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WonderBlockBlock extends Block {
    public WonderBlockBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).jumpFactor(2).strength(10, 10));
    }
}
