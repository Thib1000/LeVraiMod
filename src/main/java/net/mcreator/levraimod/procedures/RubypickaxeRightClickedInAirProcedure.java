package net.mcreator.levraimod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.levraimod.particle.RubyparticleParticle;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class RubypickaxeRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure RubypickaxeRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency x for procedure RubypickaxeRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency y for procedure RubypickaxeRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency z for procedure RubypickaxeRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.addParticle(RubyparticleParticle.particle, x, y, z, 0, 1, 0);
	}
}
