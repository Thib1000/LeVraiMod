package net.mcreator.levraimod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Inventory;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.levraimod.item.SunpickItem;
import net.mcreator.levraimod.LeVraiModModVariables;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class SunpickBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure SunpickBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency x for procedure SunpickBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency y for procedure SunpickBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency z for procedure SunpickBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (SunpickItem.block.canHarvestBlock((world.getBlockState(new BlockPos(x, y, z)))) == true) {
			if (!(((world instanceof World && ((World) world).getRecipeManager()
					.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
							((World) world))
					.isPresent())
							? ((World) world).getRecipeManager()
									.getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))), (World) world)
									.get().getRecipeOutput().copy()
							: ItemStack.EMPTY)
					.getItem() == Blocks.AIR.asItem())) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
							((world instanceof World && ((World) world).getRecipeManager()
									.getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))), ((World) world))
									.isPresent())
											? ((World) world).getRecipeManager()
													.getRecipe(IRecipeType.SMELTING,
															new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
															(World) world)
													.get().getRecipeOutput().copy()
											: ItemStack.EMPTY));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				world.destroyBlock(new BlockPos(x, y, z), false);
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
					world.destroyBlock(new BlockPos(x, y, z), false);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
				}
				LeVraiModModVariables.poseruneblockdedim = (true);
			} else {
				LeVraiModModVariables.poseruneblockdedim = (false);
			}
		}
	}
}
