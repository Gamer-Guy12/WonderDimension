package net.da_fence85.wonderdimension.item.armor.purewonder;

import net.da_fence85.wonderdimension.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PureWonderHelmet extends ArmorItem {
    public PureWonderHelmet() {
        super(ModArmorMaterials.PURE_WONDER, Type.HELMET, new Item.Properties());
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        super.onArmorTick(stack, level, player);

        if (!level.isClientSide()) {
            evaluateArmor(player);
        }
    }

    private boolean evaluateArmor(Player player) {
        if (hasFullArmor(player)) {
            if (hasCorrectArmor(player)) {
                float xp = (float) player.experienceLevel;

                float speedMultiplyer = Math.round(xp / 50) + 1;
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                        200, (int) speedMultiplyer, false, false, true));

                float jumpMultiplyer = Math.round(xp / 70) + 1;
                player.addEffect(new MobEffectInstance(MobEffects.JUMP,
                        200, (int) jumpMultiplyer, false, false, true));

                float digMultiplyer = Math.round(xp / 20) + 1;
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,
                        200, (int) digMultiplyer, false, false, true));

                float healthMultiplyer = Math.round(xp / 50);
                player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,
                        200, (int) healthMultiplyer, false, false, true));

                float strengthMultiplyer = Math.round(xp / 40) + 1;
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,
                        200, (int) strengthMultiplyer, false, false, true));
            }
        }

        return false;
    }

    private boolean hasCorrectArmor(Player player) {
        ArmorItem helmet = (ArmorItem) player.getInventory().getArmor(3).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmor(2).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmor(1).getItem();
        ArmorItem boots = (ArmorItem) player.getInventory().getArmor(0).getItem();

        return (helmet.getMaterial() == ModArmorMaterials.PURE_WONDER) &&
                (chestplate.getMaterial() == ModArmorMaterials.PURE_WONDER) &&
                (leggings.getMaterial() == ModArmorMaterials.PURE_WONDER) &&
                (boots.getMaterial() == ModArmorMaterials.PURE_WONDER);
    }

    private boolean hasFullArmor(Player player) {

        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && helmet.isEmpty();
    }
}
