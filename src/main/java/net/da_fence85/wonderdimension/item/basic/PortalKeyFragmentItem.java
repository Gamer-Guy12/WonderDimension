package net.da_fence85.wonderdimension.item.basic;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PortalKeyFragmentItem extends Item {
    public PortalKeyFragmentItem() {
        super(new Item.Properties());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pPlayer.sendSystemMessage(Component.translatable("message.wonderdimension.portal_key_fragment"));
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
