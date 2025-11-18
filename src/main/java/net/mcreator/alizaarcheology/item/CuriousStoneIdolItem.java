package net.mcreator.alizaarcheology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.alizaarcheology.init.AlizaArcheologyModItems;

public class CuriousStoneIdolItem extends Item {
	public CuriousStoneIdolItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(AlizaArcheologyModItems.FADED_STONE_IDOL.get());
	}
}