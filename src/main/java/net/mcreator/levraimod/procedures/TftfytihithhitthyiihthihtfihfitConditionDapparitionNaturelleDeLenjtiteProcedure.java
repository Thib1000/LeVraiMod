package net.mcreator.levraimod.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.RegistryKey;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.levraimod.entity.TftfytihithhitthyiihthihtfihfitEntity;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLenjtiteProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn(
						"Failed to load dependency world for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLenjtite!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency x for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLenjtite!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency y for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLenjtite!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency z for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLenjtite!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null && BiomeDictionary.hasType(
				RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
						world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
				BiomeDictionary.Type.MAGICAL)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TftfytihithhitthyiihthihtfihfitEntity.CustomEntity(TftfytihithhitthyiihthihtfihfitEntity.entity,
						(World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
