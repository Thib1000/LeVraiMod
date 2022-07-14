package net.mcreator.levraimod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BoneMealItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.levraimod.LeVraiModMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class ReviverMiseAJourDuTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure ReviverMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency x for procedure ReviverMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency y for procedure ReviverMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency z for procedure ReviverMiseAJourDuTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double coordonees = 0;
		boolean oui = false;
		if (new Object() {
			public int getAmount(IWorld world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), (int) (0)) > 8) {
			if ((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == Items.BONE_MEAL) {
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x + 1, y, z)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x + 1, y, z), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x + 1, y, z), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x + 1, y, z + 1)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x + 1, y, z + 1), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x + 1, y, z + 1), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x, y, z + 1)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x, y, z + 1), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x, y, z + 1), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x - 1, y, z + 1)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x - 1, y, z + 1), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x - 1, y, z + 1), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x - 1, y, z)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x - 1, y, z), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x - 1, y, z), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x - 1, y, z - 1)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x - 1, y, z - 1), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x - 1, y, z - 1), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x, y, z - 1)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x, y, z - 1), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x, y, z - 1), 0);
					}
				}
				if (world instanceof World) {
					if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x + 1, y, z - 1)) || BoneMealItem
							.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x + 1, y, z - 1), (Direction) null)) {
						if (!world.isRemote())
							((World) world).playEvent(2005, new BlockPos(x + 1, y, z - 1), 0);
					}
				}
				{
					TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final int _amount = (int) 8;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_sltid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
							}
						});
					}
				}
				world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), (int) 100);
			}
		}
		if (new Object() {
			public int getAmount(IWorld world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), (int) (1)) >= 1) {
			if ((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == Blocks.CARROTS.asItem()) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x, y, z));
					world.destroyBlock(new BlockPos(x + 1, y, z), false);
				}
			}
		}
	}
}
