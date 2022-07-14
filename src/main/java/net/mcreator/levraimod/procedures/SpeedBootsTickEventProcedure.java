package net.mcreator.levraimod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;

public class SpeedBootsTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure SpeedBootsTickEvent!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SpeedBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double previousRecipe = 0;
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Items.SUGAR)) : false) {
			if (entity.isSprinting()) {
				if (Math.random() < 0.6) {
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(Items.SUGAR);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
				}
				if ((EnchantmentHelper.getEnchantmentLevel(Enchantments.FROST_WALKER, itemstack) != 0)) {
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(Items.SUGAR);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 5,
								((PlayerEntity) entity).container.func_234641_j_());
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1, (int) 50));
			}
		} else {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.SPEED);
			}
		}
	}
}
