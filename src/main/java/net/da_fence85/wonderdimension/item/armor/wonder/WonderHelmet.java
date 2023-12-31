package net.da_fence85.wonderdimension.item.armor.wonder;

import net.da_fence85.wonderdimension.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WonderHelmet extends ArmorItem {
    public WonderHelmet() {
        super(ModArmorMaterials.WONDER, Type.HELMET, new Item.Properties());
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        super.onArmorTick(stack, level, player);

        if (!level.isClientSide()) {
            if (evaluateArmor(player)) {

            }
        }
    }

    private boolean evaluateArmor(Player player) {
        if (hasFullArmor(player)) {
            if (hasCorrectArmor(player)) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                        200, 1, false, false, true));

                player.addEffect(new MobEffectInstance(MobEffects.JUMP,
                        200, 1, false, false, true));

                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,
                        200, 1, false, false, true));
            }
        }

        return false;
    }

    private boolean hasCorrectArmor(Player player) {
        ArmorItem helmet = (ArmorItem) player.getInventory().getArmor(3).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmor(2).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmor(1).getItem();
        ArmorItem boots = (ArmorItem) player.getInventory().getArmor(0).getItem();

        return (helmet.getMaterial() == ModArmorMaterials.WONDER) &&
                (chestplate.getMaterial() == ModArmorMaterials.WONDER) &&
                (leggings.getMaterial() == ModArmorMaterials.WONDER) &&
                (boots.getMaterial() == ModArmorMaterials.WONDER);
    }

    private boolean hasFullArmor(Player player) {

        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && helmet.isEmpty();
    }
}
