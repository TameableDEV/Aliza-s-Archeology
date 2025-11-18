package net.mcreator.alizaarcheology.potion;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.component.DataComponents;

import net.mcreator.alizaarcheology.procedures.DarkwaterPosionOnEffectActiveTickProcedure;
import net.mcreator.alizaarcheology.init.AlizaArcheologyModParticleTypes;
import net.mcreator.alizaarcheology.init.AlizaArcheologyModMobEffects;

import java.util.List;
import java.util.ArrayList;

@EventBusSubscriber
public class DarkwaterPosionMobEffect extends MobEffect {
	public DarkwaterPosionMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434727, mobEffectInstance -> (SimpleParticleType) (AlizaArcheologyModParticleTypes.DARKWATERSOAKED.get()));
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		DarkwaterPosionOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		Consumable original = Items.HONEY_BOTTLE.components().get(DataComponents.CONSUMABLE);
		if (original != null) {
			List<ConsumeEffect> onConsumeEffects = new ArrayList<>(original.onConsumeEffects());
			onConsumeEffects.add(new RemoveStatusEffectsConsumeEffect(AlizaArcheologyModMobEffects.DARKWATER_POSION));
			Consumable replacementConsumable = new Consumable(original.consumeSeconds(), original.animation(), original.sound(), original.hasConsumeParticles(), onConsumeEffects);
			event.modify(Items.HONEY_BOTTLE, builder -> builder.set(DataComponents.CONSUMABLE, replacementConsumable));
		}
	}
}