package net.mcreator.levraimod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.levraimod.item.PointsNPCItem;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.function.Supplier;
import java.util.Map;

public class NPCanvanceprossesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn("Failed to load dependency entity for procedure NPCanvanceprosses!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
				}.getItemStack((int) (2))).getItem() == Items.COAL) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
					if (Math.random() < 0.03) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(PointsNPCItem.block);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
				}
			}
		}
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
			}.getItemStack((int) (2))).getItem() == Blocks.IRON_ORE.asItem()) {
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
				}.getItemStack((int) (0))).getItem() == Items.COAL) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
					if (Math.random() < 0.03) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(PointsNPCItem.block);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
				}
			}
		}
	}
}
