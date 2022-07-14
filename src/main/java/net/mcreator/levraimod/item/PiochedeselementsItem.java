
package net.mcreator.levraimod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.levraimod.procedures.PiochedeselementsBlockDestroyedWithToolProcedure;
import net.mcreator.levraimod.itemgroup.Thib1000ItemGroup;
import net.mcreator.levraimod.LeVraiModModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@LeVraiModModElements.ModElement.Tag
public class PiochedeselementsItem extends LeVraiModModElements.ModElement {
	@ObjectHolder("le_vrai_mod:piochedeselements")
	public static final Item block = null;

	public PiochedeselementsItem(LeVraiModModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 3f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LingotdesdimensionsItem.block),
						new ItemStack(LingotdesdimensionsoverworldetnetherItem.block), new ItemStack(LingotdesdimensionsenderetrefinedItem.block));
			}
		}, 1, -3f, new Item.Properties().group(Thib1000ItemGroup.tab)) {
			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, blockstate, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();

				PiochedeselementsBlockDestroyedWithToolProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("piochedeselements"));
	}
}
