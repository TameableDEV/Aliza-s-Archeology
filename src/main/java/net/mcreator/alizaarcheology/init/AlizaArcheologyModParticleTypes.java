/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.alizaarcheology.AlizaArcheologyMod;

public class AlizaArcheologyModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, AlizaArcheologyMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> DARKWATERSOAKED = REGISTRY.register("darkwatersoaked", () -> new SimpleParticleType(false));
}