package net.da_fence85.wonderdimension.block.basic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PureWonderBlockBlock extends Block {
    public PureWonderBlockBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).jumpFactor(2).speedFactor(3).strength(15, 20).requiresCorrectToolForDrops());
    }
}
