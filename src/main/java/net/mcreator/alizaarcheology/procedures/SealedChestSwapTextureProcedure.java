package net.mcreator.alizaarcheology.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.alizaarcheology.init.AlizaArcheologyModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SealedChestSwapTextureProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHER_STAR && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get()) {
			assert Boolean.TRUE; //#dbg:SealedChestSwapTexture:Sealedchestswapbegin
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get().defaultBlockState(), "blockstate", 0)).getBlock()) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				assert Boolean.TRUE; //#dbg:SealedChestSwapTexture:SealedChest1
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get().defaultBlockState(), "blockstate", 1)).getBlock()) {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				assert Boolean.TRUE; //#dbg:SealedChestSwapTexture:SealedChest2
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(AlizaArcheologyModBlocks.NEW_SEAL_CHEST.get().defaultBlockState(), "blockstate", 2)).getBlock()) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				assert Boolean.TRUE; //#dbg:SealedChestSwapTexture:SealedChest0
			}
		}
	}
}