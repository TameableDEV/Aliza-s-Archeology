/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.alizaarcheology.item.*;
import net.mcreator.alizaarcheology.AlizaArcheologyMod;

import java.util.function.Function;

public class AlizaArcheologyModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlizaArcheologyMod.MODID);
	public static final DeferredItem<Item> KORVAX_BANNER_PATTERN;
	public static final DeferredItem<Item> SEALED_CHEST;
	public static final DeferredItem<Item> PRODUCT_BANNER_PATTERN;
	public static final DeferredItem<Item> DARK_SEALED_CHEST;
	public static final DeferredItem<Item> CHEST_UNSEALER;
	public static final DeferredItem<Item> CURIOUS_STONE_IDOL;
	public static final DeferredItem<Item> FADED_STONE_IDOL;
	public static final DeferredItem<Item> WRECKED_STONE_IDOL;
	public static final DeferredItem<Item> IDOLS_MUSIC_DISC;
	public static final DeferredItem<Item> ANCIENT_METAL_IOTA;
	public static final DeferredItem<Item> UNKNOWN_METAL;
	public static final DeferredItem<Item> NIGHT_VISION_EMITTERS;
	public static final DeferredItem<Item> RHO_ALLOY;
	public static final DeferredItem<Item> CUPROARURO_COMPOSITE;
	public static final DeferredItem<Item> LUMINOUS_RHO_FLUID;
	public static final DeferredItem<Item> SUSPENDED_GEL;
	public static final DeferredItem<Item> BOTTLED_BLAZE_POWDER;
	public static final DeferredItem<Item> INKY_MIXTURE;
	public static final DeferredItem<Item> THICK_MIXTURE;
	public static final DeferredItem<Item> NIGHT_VISION_SPINE;
	public static final DeferredItem<Item> RHO_HELMET_SHELL;
	public static final DeferredItem<Item> UNASSEMBLED_RHO_HELMET_SHELL;
	static {
		KORVAX_BANNER_PATTERN = register("korvax_banner_pattern", KorvaxBannerPatternItem::new);
		SEALED_CHEST = block(AlizaArcheologyModBlocks.SEALED_CHEST, new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON).fireResistant());
		PRODUCT_BANNER_PATTERN = register("product_banner_pattern", ProductBannerPatternItem::new);
		DARK_SEALED_CHEST = block(AlizaArcheologyModBlocks.DARK_SEALED_CHEST, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).fireResistant());
		CHEST_UNSEALER = register("chest_unsealer", ChestUnsealerItem::new);
		CURIOUS_STONE_IDOL = register("curious_stone_idol", CuriousStoneIdolItem::new);
		FADED_STONE_IDOL = register("faded_stone_idol", FadedStoneIdolItem::new);
		WRECKED_STONE_IDOL = register("wrecked_stone_idol", WreckedStoneIdolItem::new);
		IDOLS_MUSIC_DISC = register("idols_music_disc", IdolsMusicDiscItem::new);
		ANCIENT_METAL_IOTA = register("ancient_metal_iota", AncientMetalIotaItem::new);
		UNKNOWN_METAL = register("unknown_metal", UnknownMetalItem::new);
		NIGHT_VISION_EMITTERS = register("night_vision_emitters", NightVisionEmittersItem::new);
		RHO_ALLOY = register("rho_alloy", RhoAlloyItem::new);
		CUPROARURO_COMPOSITE = register("cuproaruro_composite", CuproaruroCompositeItem::new);
		LUMINOUS_RHO_FLUID = register("luminous_rho_fluid", LuminousRhoFluidItem::new);
		SUSPENDED_GEL = register("suspended_gel", SuspendedGelItem::new);
		BOTTLED_BLAZE_POWDER = register("bottled_blaze_powder", BottledBlazePowderItem::new);
		INKY_MIXTURE = register("inky_mixture", InkyMixtureItem::new);
		THICK_MIXTURE = register("thick_mixture", ThickMixtureItem::new);
		NIGHT_VISION_SPINE = register("night_vision_spine", NightVisionSpineItem::new);
		RHO_HELMET_SHELL = register("rho_helmet_shell", RhoHelmetShellItem::new);
		UNASSEMBLED_RHO_HELMET_SHELL = register("unassembled_rho_helmet_shell", UnassembledRhoHelmetShellItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}