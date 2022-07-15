package net.mcreator.levraimod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.levraimod.LeVraiModModVariables;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class ResetQuandUneCommandeEstExecuteeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure ResetQuandUneCommandeEstExecutee!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		LeVraiModModVariables.WorldVariables.get(world).Blocs_Mines_sunPick = 0;
		LeVraiModModVariables.WorldVariables.get(world).syncData(world);
	}
}
