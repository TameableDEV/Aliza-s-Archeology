/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class AlizaArcheologyModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(AlizaArcheologyModBlocks.SEALED_CHEST.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 26), new ItemStack(AlizaArcheologyModBlocks.DARK_SEALED_CHEST.get()), 1, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("aliza_archeology:shipwright"))) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get()), 10, 15, 0.15f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(AlizaArcheologyModBlocks.SEALED_CHEST.get()), 4, 15, 0.15f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 40), new ItemStack(AlizaArcheologyModBlocks.DARK_SEALED_CHEST.get()), 2, 15, 0.45f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("aliza_archeology:shipwright"))) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Blocks.CANDLE, 4), 12, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Blocks.LANTERN), 12, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.GLOWSTONE_DUST), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.SPYGLASS), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 4), new ItemStack(Items.EMERALD), 12, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 6), new ItemStack(Items.EMERALD), 15, 5, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("aliza_archeology:shipwright"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.PAPER, 24), new ItemStack(Items.EMERALD), 4, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.WHITE_WOOL, 18), new ItemStack(Items.EMERALD), 8, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_PLANKS, 16), new ItemStack(Items.EMERALD), 12, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.OAK_BOAT), 2, 8, 0.1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Items.OAK_CHEST_BOAT), 1, 10, 0.15f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("aliza_archeology:shipwright"))) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.APPLE, 4), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AlizaArcheologyModItems.CHEST_UNSEALER.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25), new ItemStack(Items.RECOVERY_COMPASS), 2, 30, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Blocks.SOUL_LANTERN), 8, 10, 0.05f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("aliza_archeology:shipwright"))) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.COMPASS), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.CHAIN, 6), new ItemStack(Items.EMERALD, 2), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.TRIPWIRE_HOOK, 8), new ItemStack(Items.EMERALD), 12, 15, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.GUNPOWDER), 10, 5, 0.05f));
		}
	}
}