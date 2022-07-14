package net.mcreator.levraimod.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class HelpQuandUneCommandeEstExecuteeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure HelpQuandUneCommandeEstExecutee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity)
					.sendStatusMessage(new StringTextComponent("Bonjour, Je m'appelle Thib1000 et je suis le cr\uFFFDateur de ce mod."), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(" Je suis ici car vous m'avez appel\uFFFD. "), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Premierement, ce mod est un mod de tout "), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					"Dans le nether, appuyez sur la touche \"num9\" en \uFFFDtant accroupis et le boss du nether apparaitera"), (false));
		}
	}
}
