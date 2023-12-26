package net.da_fence85.wonderdimension.block.basic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class WonderOreBlock extends Block {
    public WonderOreBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE));
    }
}
