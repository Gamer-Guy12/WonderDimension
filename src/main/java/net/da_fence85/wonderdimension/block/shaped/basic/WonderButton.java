package net.da_fence85.wonderdimension.block.shaped.basic;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WonderButton extends ButtonBlock {
    public WonderButton() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()), BlockSetType.IRON,10, true);
    }
}
