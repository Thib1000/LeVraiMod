package net.mcreator.levraimod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Inventory;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.levraimod.item.SunpickItem;
import net.mcreator.levraimod.enchantment.LevelEnchantment;
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure SunpickBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SunpickBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (SunpickItem.block.canHarvestBlock((world.getBlockState(new BlockPos(x, y, z)))) == true) {
			if (!(EnchantmentHelper.getEnchantmentLevel(LevelEnchantment.enchantment, itemstack) != 0)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
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
				}
			} else if ((EnchantmentHelper.getEnchantmentLevel(LevelEnchantment.enchantment, itemstack) != 0)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem()) && !entity.isSneaking()) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
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
						((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 6));
					}
				}
			}
		}
		LeVraiModModVariables.WorldVariables.get(world).Blocs_Mines_sunPick = (LeVraiModModVariables.WorldVariables.get(world).Blocs_Mines_sunPick
				+ 1);
		LeVraiModModVariables.WorldVariables.get(world).syncData(world);
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == SunpickItem.block
				&& LeVraiModModVariables.WorldVariables.get(world).Blocs_Mines_sunPick >= 10
				&& !(EnchantmentHelper.getEnchantmentLevel(LevelEnchantment.enchantment, itemstack) != 0)) {
			(itemstack).addEnchantment(LevelEnchantment.enchantment, (int) 2);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("le_vrai_mod:grunt_birthday_sound_effect")),
						SoundCategory.NEUTRAL, (float) 10, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("le_vrai_mod:grunt_birthday_sound_effect")),
						SoundCategory.NEUTRAL, (float) 10, (float) 1, false);
			}
		}
	}
}
