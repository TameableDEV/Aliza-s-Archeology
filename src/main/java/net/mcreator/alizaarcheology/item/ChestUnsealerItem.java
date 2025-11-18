package net.mcreator.alizaarcheology.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.alizaarcheology.procedures.ChestUnsealerRightclickedOnBlockProcedure;

public class ChestUnsealerItem extends Item {
	public ChestUnsealerItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChestUnsealerRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}