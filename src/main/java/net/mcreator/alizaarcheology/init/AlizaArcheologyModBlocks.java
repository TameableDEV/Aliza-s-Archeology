/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alizaarcheology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.alizaarcheology.block.SealedChestBlock;
import net.mcreator.alizaarcheology.block.NewSealChestBlock;
import net.mcreator.alizaarcheology.block.DarkSealedChestBlock;
import net.mcreator.alizaarcheology.AlizaArcheologyMod;

import java.util.function.Function;

public class AlizaArcheologyModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlizaArcheologyMod.MODID);
	public static final DeferredBlock<Block> SEALED_CHEST;
	public static final DeferredBlock<Block> DARK_SEALED_CHEST;
	public static final DeferredBlock<Block> NEW_SEAL_CHEST;
	static {
		SEALED_CHEST = register("sealed_chest", SealedChestBlock::new);
		DARK_SEALED_CHEST = register("dark_sealed_chest", DarkSealedChestBlock::new);
		NEW_SEAL_CHEST = register("new_seal_chest", NewSealChestBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}