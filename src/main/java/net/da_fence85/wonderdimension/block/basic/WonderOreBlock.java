package net.da_fence85.wonderdimension.block.basic;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class WonderOreBlock extends DropExperienceBlock {
    public WonderOreBlock() {

        super(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops().strength(7, 3), UniformInt.of(7, 12));
    }
}
