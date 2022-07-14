package net.mcreator.levraimod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.levraimod.item.PpetedeelementsItem;
import net.mcreator.levraimod.item.BottesvolantesItem;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;
import java.util.Iterator;

public class BottesvolantesBootsTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure BottesvolantesBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BottesvolantesItem.boots)) : false) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 3));
		}
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(PpetedeelementsItem.block)) : false) {
			if (entity.isSneaking()) {
				if (entity.isBurning()) {
					if (entity instanceof PlayerEntity) {
						((PlayerEntity) entity).abilities.allowFlying = (true);
						((PlayerEntity) entity).sendPlayerAbilities();
					}
					if (entity instanceof ServerPlayerEntity) {
						Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
								.getAdvancement(new ResourceLocation("le_vrai_mod:reborn"));
						AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemaningCriteria().iterator();
							while (_iterator.hasNext()) {
								String _criterion = (String) _iterator.next();
								((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
							}
						}
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(BottesvolantesItem.boots);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(PpetedeelementsItem.block);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
				}
			}
		}
	}
}
