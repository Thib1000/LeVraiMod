
package net.mcreator.levraimod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.levraimod.itemgroup.Thib1000ItemGroup;
import net.mcreator.levraimod.block.SunblockBlock;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class SunshovelItem extends LeVraiModModElements.ModElement {
	@ObjectHolder("le_vrai_mod:sunshovel")
	public static final Item block = null;

	public SunshovelItem(LeVraiModModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SuningotItem.block), new ItemStack(SunblockBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(Thib1000ItemGroup.tab)) {
		}.setRegistryName("sunshovel"));
	}
}
