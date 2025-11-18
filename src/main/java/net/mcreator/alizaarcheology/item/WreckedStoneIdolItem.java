package net.mcreator.alizaarcheology.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.alizaarcheology.procedures.WreckedStoneIdolPlayerFinishesUsingItemProcedure;

public class WreckedStoneIdolItem extends Item {
	public WreckedStoneIdolItem(Item.Properties properties) {
		super(properties.stacksTo(1).fireResistant().food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(5F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WreckedStoneIdolPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}