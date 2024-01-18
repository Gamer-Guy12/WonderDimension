package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WonderPressurePlate extends PressurePlateBlock {
    public WonderPressurePlate() {
        super(Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()), BlockSetType.IRON);
    }
}
