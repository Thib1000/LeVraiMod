package net.mcreator.levraimod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.levraimod.item.TestpournicolasItem;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class Testpournico84AfficherLoverlayEnJeuProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure Testpournico84AfficherLoverlayEnJeu!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == TestpournicolasItem.helmet) {
			return true;
		}
		return false;
	}
}
