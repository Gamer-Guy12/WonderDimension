package net.da_fence85.wonderdimension.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.da_fence85.wonderdimension.WonderDimensionMod;
import net.da_fence85.wonderdimension.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillageSiegeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = WonderDimensionMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.CARTOGRAPHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 33),
                    new ItemStack(ModItems.PORTAL_KEY_FRAGMENT.get(), 1),
                    2, 10, 0.3f
            ));
        }
    }

    @SubscribeEvent
    public static void villagerSiege(VillageSiegeEvent event) {
        event.getPlayer().sendSystemMessage(Component.translatable("message.wonderdimension.siege"));
    }

}
