package net.da_fence85.wonderdimension.block.shaped.basic.wonder;

import net.da_fence85.wonderdimension.block.ModBlocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WonderDoor extends DoorBlock {
    public WonderDoor() {
        super(BlockBehaviour.Properties.copy(ModBlocks.WONDER_BLOCK.get()).noOcclusion(), BlockSetType.IRON);
    }
}
