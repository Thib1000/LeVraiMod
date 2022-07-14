
package net.mcreator.levraimod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.levraimod.itemgroup.Thib1000ItemGroup;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class EpeedeselementsItem extends LeVraiModModElements.ModElement {
	@ObjectHolder("le_vrai_mod:epeedeselements")
	public static final Item block = null;

	public EpeedeselementsItem(LeVraiModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LingotdesdimensionsoverworldetnetherItem.block),
						new ItemStack(LingotdesdimensionsenderetrefinedItem.block), new ItemStack(LingotdesdimensionsItem.block));
			}
		}, 3, 6f, new Item.Properties().group(Thib1000ItemGroup.tab)) {
		}.setRegistryName("epeedeselements"));
	}
}
