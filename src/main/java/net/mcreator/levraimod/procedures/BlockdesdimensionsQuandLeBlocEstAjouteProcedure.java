package net.mcreator.levraimod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import net.mcreator.levraimod.block.BlockdesdimensionsBlock;
import net.mcreator.levraimod.LeVraiModModVariables;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.Map;
import java.util.HashMap;

public class BlockdesdimensionsQuandLeBlocEstAjouteProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
			Entity entity = event.getEntity();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("px", entity.getPosX());
			dependencies.put("py", entity.getPosY());
			dependencies.put("pz", entity.getPosZ());
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("blockstate", event.getState());
			dependencies.put("placedagainst", event.getPlacedAgainst());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure BlockdesdimensionsQuandLeBlocEstAjoute!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency x for procedure BlockdesdimensionsQuandLeBlocEstAjoute!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency y for procedure BlockdesdimensionsQuandLeBlocEstAjoute!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency z for procedure BlockdesdimensionsQuandLeBlocEstAjoute!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BlockdesdimensionsBlock.block) {
			LeVraiModModVariables.poseruneblockdedim = (true);
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 255, 10, 10, 10, 100);
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			if (LeVraiModModVariables.poseruneblockdedim == true) {
				LeVraiModMod.LOGGER.warn("Poser le bloc est pass\uFFFD \uFFFD vrai");
			}
		}
		if (LeVraiModModVariables.poseruneblockdedim == true) {
			if (dependencies.get("event") != null) {
				Object _obj = dependencies.get("event");
				if (_obj instanceof Event) {
					Event _evt = (Event) _obj;
					if (_evt.isCancelable())
						_evt.setCanceled(true);
				}
			}
			LeVraiModMod.LOGGER.fatal("Poser le bloc est pass\uFFFD \uFFFD vrai");
		}
	}
}
