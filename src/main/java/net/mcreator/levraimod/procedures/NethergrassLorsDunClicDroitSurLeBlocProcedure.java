package net.mcreator.levraimod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.levraimod.item.RubyItem;
import net.mcreator.levraimod.item.PointsNPCItem;
import net.mcreator.levraimod.block.MineralgrassBlock;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class NethergrassLorsDunClicDroitSurLeBlocProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure NethergrassLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency x for procedure NethergrassLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency y for procedure NethergrassLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency z for procedure NethergrassLorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure NethergrassLorsDunClicDroitSurLeBloc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.7) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.COAL));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MineralgrassBlock.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.IRON_INGOT));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MineralgrassBlock.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.1) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.GOLD_INGOT));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MineralgrassBlock.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.05) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.DIAMOND));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MineralgrassBlock.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.025) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RubyItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MineralgrassBlock.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (Math.random() < 0.01) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PointsNPCItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (Math.random() < 0.3) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MineralgrassBlock.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
	}
}
