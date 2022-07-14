package net.mcreator.levraimod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.levraimod.entity.TftfytihithhitthyiihthihtfihfitEntity;
import net.mcreator.levraimod.LeVraiModMod;

import java.util.function.Supplier;
import java.util.Map;

public class TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLentiteProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency world for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLentite!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency x for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLentite!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency y for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLentite!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LeVraiModMod.LOGGER
						.warn("Failed to load dependency z for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLentite!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LeVraiModMod.LOGGER.warn(
						"Failed to load dependency entity for procedure TftfytihithhitthyiihthihtfihfitConditionDapparitionNaturelleDeLentite!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double ok = 0;
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
			}.getItemStack((int) (0))).getItem() == Blocks.STONE.asItem()) {
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
				}.getAmount((int) (1)) >= 1) {
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
					}.getItemStack((int) (1))).getItem() == Blocks.STONE.asItem()) {
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
						}.getAmount((int) (2)) >= 1) {
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
							}.getItemStack((int) (2))).getItem() == Blocks.STONE.asItem()) {
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
								}.getAmount((int) (3)) >= 1) {
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
									}.getItemStack((int) (3))).getItem() == Blocks.STONE.asItem()) {
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
										}.getAmount((int) (4)) >= 1) {
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
											}.getItemStack((int) (4))).getItem() == Blocks.STONE.asItem()) {
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
												}.getAmount((int) (5)) >= 1) {
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
													}.getItemStack((int) (5))).getItem() == Blocks.STONE.asItem()) {
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
														}.getAmount((int) (6)) >= 1) {
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
															}.getItemStack((int) (6))).getItem() == Blocks.STONE.asItem()) {
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
																}.getAmount((int) (7)) >= 1) {
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
																	}.getItemStack((int) (7))).getItem() == Blocks.STONE.asItem()) {
																		if (new Object() {
																			public int getAmount(int sltid) {
																				if (entity instanceof ServerPlayerEntity) {
																					Container _current = ((ServerPlayerEntity) entity).openContainer;
																					if (_current instanceof Supplier) {
																						Object invobj = ((Supplier) _current).get();
																						if (invobj instanceof Map) {
																							ItemStack stack = ((Slot) ((Map) invobj).get(sltid))
																									.getStack();;
																							if (stack != null)
																								return stack.getCount();
																						}
																					}
																				}
																				return 0;
																			}
																		}.getAmount((int) (8)) >= 1) {
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
																			}.getItemStack((int) (8))).getItem() == Blocks.STONE.asItem()) {
																				if (entity instanceof PlayerEntity)
																					((PlayerEntity) entity).closeScreen();
																				for (int index0 = 0; index0 < (int) (8); index0++) {
																					if (world instanceof ServerWorld) {
																						((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION,
																								x, y, z, (int) 20, 3, 3, 3, 1);
																					}
																					if (world instanceof ServerWorld) {
																						((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, x, y,
																								z, (int) 20, 3, 3, 3, 1);
																					}
																				}
																				if (world instanceof ServerWorld) {
																					Entity entityToSpawn = new TftfytihithhitthyiihthihtfihfitEntity.CustomEntity(
																							TftfytihithhitthyiihthihtfihfitEntity.entity,
																							(World) world);
																					entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																					entityToSpawn.setRenderYawOffset((float) 0);
																					entityToSpawn.setRotationYawHead((float) 0);
																					entityToSpawn.setMotion(0, 0, 0);
																					if (entityToSpawn instanceof MobEntity)
																						((MobEntity) entityToSpawn).onInitialSpawn(
																								(ServerWorld) world,
																								world.getDifficultyForLocation(
																										entityToSpawn.getPosition()),
																								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																								(CompoundNBT) null);
																					world.addEntity(entityToSpawn);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
