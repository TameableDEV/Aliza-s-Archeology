package net.mcreator.alizaarcheology.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.alizaarcheology.procedures.BottledBlazePowderPlayerFinishesUsingItemProcedure;

public class BottledBlazePowderItem extends Item {
	public BottledBlazePowderItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0.3f).alwaysEdible().build(), Consumables.defaultDrink().consumeSeconds(1.4F).build()).usingConvertsTo(Items.GLASS_BOTTLE));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		BottledBlazePowderPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}