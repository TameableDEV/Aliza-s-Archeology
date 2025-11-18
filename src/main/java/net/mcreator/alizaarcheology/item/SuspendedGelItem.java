package net.mcreator.alizaarcheology.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.alizaarcheology.procedures.SuspendedGelPlayerFinishesUsingItemProcedure;

public class SuspendedGelItem extends Item {
	public SuspendedGelItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0.5f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		SuspendedGelPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}