package net.da_fence85.wonderdimension.block.shaped.basic;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WonderFenceGate extends FenceGateBlock {
    public WonderFenceGate() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()), SoundEvents.AMETHYST_BLOCK_PLACE, SoundEvents.AMETHYST_BLOCK_BREAK);
    }
}
