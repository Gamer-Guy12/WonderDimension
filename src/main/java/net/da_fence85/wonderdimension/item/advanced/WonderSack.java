package net.da_fence85.wonderdimension.item.advanced;

import net.minecraft.nbt.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.io.DataOutput;
import java.io.IOException;

public class WonderSack extends Item {
    public WonderSack() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pUsedHand == InteractionHand.OFF_HAND) {
            pPlayer.sendSystemMessage(Component.translatable("message.wonderdimension.wrong_sack_hand"));
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public @Nullable CompoundTag getShareTag(ItemStack stack) {
        return super.getShareTag(stack);
    }
}
