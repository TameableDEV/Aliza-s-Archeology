/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.alizaarcheology.AlizaArcheologyMod;

public class AlizaArcheologyModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, AlizaArcheologyMod.MODID);
	public static final DeferredHolder<Potion, Potion> TOXIC_SEAWATER = REGISTRY.register("toxic_seawater", () -> new Potion("toxic_seawater", new MobEffectInstance(AlizaArcheologyModMobEffects.DARKWATER_POSION, 3600, 0, false, true)));
}