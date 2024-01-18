package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WonderTrapDoor extends TrapDoorBlock {
    public WonderTrapDoor() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()).noOcclusion(), BlockSetType.IRON);
    }
}
