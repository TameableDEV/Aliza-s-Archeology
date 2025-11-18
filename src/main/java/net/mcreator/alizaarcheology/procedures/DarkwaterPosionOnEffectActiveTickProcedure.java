package net.mcreator.alizaarcheology.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.alizaarcheology.init.AlizaArcheologyModMobEffects;
import net.mcreator.alizaarcheology.AlizaArcheologyMod;

public class DarkwaterPosionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel _serverLevel0
				&& _plr0.getAdvancements().getOrStartProgress(_serverLevel0.getServer().getAdvancements().get(ResourceLocation.parse("aliza_archeology:darkwater_discovery"))).isDone())) {
			if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
				AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("aliza_archeology:darkwater_discovery"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (isInWaterOrBubble(entity)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(AlizaArcheologyModMobEffects.DARKWATER_POSION);
		} else {
			AlizaArcheologyMod.queueServerWork(
					(int) (20d / ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(AlizaArcheologyModMobEffects.DARKWATER_POSION) ? _livEnt.getEffect(AlizaArcheologyModMobEffects.DARKWATER_POSION).getAmplifier() : 0) + 1)), () -> {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 6) {
							if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
								entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("aliza_archeology:darkwater")))), 1);
							}
						} else {
							entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("aliza_archeology:darkwater")))), 1);
						}
					});
		}
	}

	private static boolean isInWaterOrBubble(Entity entity) {
		return entity.isInWater() || entity.getInBlockState().is(Blocks.BUBBLE_COLUMN);
	}
}