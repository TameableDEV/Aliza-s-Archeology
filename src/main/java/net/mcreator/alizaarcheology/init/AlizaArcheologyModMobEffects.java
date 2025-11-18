/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.alizaarcheology.potion.DarkwaterPosionMobEffect;
import net.mcreator.alizaarcheology.AlizaArcheologyMod;

public class AlizaArcheologyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, AlizaArcheologyMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> DARKWATER_POSION = REGISTRY.register("darkwater_posion", () -> new DarkwaterPosionMobEffect());
}