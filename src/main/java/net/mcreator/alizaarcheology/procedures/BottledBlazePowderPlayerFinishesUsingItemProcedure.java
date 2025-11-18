package net.mcreator.alizaarcheology.procedures;

import net.minecraft.world.entity.Entity;

public class BottledBlazePowderPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(5);
	}
}