package net.da_fence85.wonderdimension.block.basic;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WonderBlockBlock extends Block {
    public WonderBlockBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).jumpFactor(2).speedFactor(2).strength(10, 10).requiresCorrectToolForDrops());
    }
}
