package net.mcreator.alizaarcheology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AncientMetalIotaItem extends Item {
	public AncientMetalIotaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant());
	}
}