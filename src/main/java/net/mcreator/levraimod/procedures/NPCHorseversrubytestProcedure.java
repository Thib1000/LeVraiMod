package net.mcreator.levraimod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.levraimod.gui.NPCavanceguiGui;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class NPCHorseversrubytestProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency world for procedure NPCHorseversrubytest!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency x for procedure NPCHorseversrubytest!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency y for procedure NPCHorseversrubytest!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency z for procedure NPCHorseversrubytest!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure NPCHorseversrubytest!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double nbreditems = 0;
		ItemStack quelitem = ItemStack.EMPTY;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0)) >= 1) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == Blocks.IRON_ORE.asItem()) {
				if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Items.COAL)) : false) {
					nbreditems = (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (0)));
					quelitem = (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0)));
					if ((quelitem).getItem() == Blocks.IRON_ORE.asItem()) {
						{
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (nbreditems));
										_current.detectAndSendChanges();
									}
								}
							}
						}
						{
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								BlockPos _bpos = new BlockPos(x, y, z);
								NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
									@Override
									public ITextComponent getDisplayName() {
										return new StringTextComponent("NPCavancegui");
									}

									@Override
									public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
										return new NPCavanceguiGui.GuiContainerMod(id, inventory,
												new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = (quelitem);
							_setstack.setCount((int) nbreditems);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
				}
			}
		}
	}
}
