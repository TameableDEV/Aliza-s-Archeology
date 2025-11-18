package net.mcreator.alizaarcheology.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CuproaruroCompositeItem extends Item {
	public CuproaruroCompositeItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}