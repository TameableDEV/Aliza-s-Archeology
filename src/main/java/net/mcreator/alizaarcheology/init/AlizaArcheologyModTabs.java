/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.alizaarcheology.AlizaArcheologyMod;

@EventBusSubscriber
public class AlizaArcheologyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlizaArcheologyMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALIZA_ARCHEOLOGY_TAB = REGISTRY.register("aliza_archeology_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.aliza_archeology.aliza_archeology_tab")).icon(() -> new ItemStack(Items.BRUSH)).displayItems((parameters, tabData) -> {
				tabData.accept(AlizaArcheologyModItems.KORVAX_BANNER_PATTERN.get());
				tabData.accept(AlizaArcheologyModItems.PRODUCT_BANNER_PATTERN.get());
				tabData.accept(AlizaArcheologyModBlocks.SEALED_CHEST.get().asItem());
				tabData.accept(AlizaArcheologyModBlocks.DARK_SEALED_CHEST.get().asItem());
				tabData.accept(AlizaArcheologyModItems.CHEST_UNSEALER.get());
				tabData.accept(AlizaArcheologyModItems.CUPROARURO_COMPOSITE.get());
				tabData.accept(AlizaArcheologyModItems.RHO_ALLOY.get());
				tabData.accept(AlizaArcheologyModItems.UNKNOWN_METAL.get());
				tabData.accept(AlizaArcheologyModItems.ANCIENT_METAL_IOTA.get());
				tabData.accept(AlizaArcheologyModItems.CURIOUS_STONE_IDOL.get());
				tabData.accept(AlizaArcheologyModItems.FADED_STONE_IDOL.get());
				tabData.accept(AlizaArcheologyModItems.WRECKED_STONE_IDOL.get());
				tabData.accept(AlizaArcheologyModItems.BOTTLED_BLAZE_POWDER.get());
				tabData.accept(AlizaArcheologyModItems.THICK_MIXTURE.get());
				tabData.accept(AlizaArcheologyModItems.INKY_MIXTURE.get());
				tabData.accept(AlizaArcheologyModItems.LUMINOUS_RHO_FLUID.get());
				tabData.accept(AlizaArcheologyModItems.SUSPENDED_GEL.get());
				tabData.accept(AlizaArcheologyModItems.NIGHT_VISION_EMITTERS.get());
				tabData.accept(AlizaArcheologyModItems.NIGHT_VISION_SPINE.get());
				tabData.accept(AlizaArcheologyModItems.UNASSEMBLED_RHO_HELMET_SHELL.get());
				tabData.accept(AlizaArcheologyModItems.RHO_HELMET_SHELL.get());
				tabData.accept(AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get().asItem());
		}
	}
}