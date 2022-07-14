package net.mcreator.levraimod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.levraimod.LeVraiModMod;

import java.util.Random;
import java.util.Map;

public class SunswordToolInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure SunswordToolInHandTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SunswordToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((EnchantmentHelper.getEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack) != 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 1, (int) 1, (false), (false)));
		} else {
			{
				ItemStack _ist = itemstack;
				if (_ist.attemptDamageItem((int) 100, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			(itemstack).addEnchantment(Enchantments.FIRE_ASPECT, (int) 1);
		}
	}
}
