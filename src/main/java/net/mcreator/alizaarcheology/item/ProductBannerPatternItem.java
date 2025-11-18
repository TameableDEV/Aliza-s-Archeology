package net.mcreator.alizaarcheology.item;

import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.alizaarcheology.AlizaArcheologyMod;

public class ProductBannerPatternItem extends Item {
	public static final TagKey<BannerPattern> PROVIDED_PATTERNS = TagKey.create(Registries.BANNER_PATTERN, ResourceLocation.fromNamespaceAndPath(AlizaArcheologyMod.MODID, "pattern_item/product_banner_pattern"));

	public ProductBannerPatternItem(Item.Properties properties) {
		super(properties.stacksTo(1).fireResistant().component(DataComponents.PROVIDES_BANNER_PATTERNS, PROVIDED_PATTERNS));
	}
}