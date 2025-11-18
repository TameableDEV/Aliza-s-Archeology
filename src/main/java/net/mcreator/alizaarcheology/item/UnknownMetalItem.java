package net.mcreator.alizaarcheology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnknownMetalItem extends Item {
	public UnknownMetalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}