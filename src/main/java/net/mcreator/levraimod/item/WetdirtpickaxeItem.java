
package net.mcreator.levraimod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.levraimod.itemgroup.Thib1000ItemGroup;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class WetdirtpickaxeItem extends LeVraiModModElements.ModElement {
	@ObjectHolder("le_vrai_mod:wetdirtpickaxe")
	public static final Item block = null;

	public WetdirtpickaxeItem(LeVraiModModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1;
			}

			public float getEfficiency() {
				return 32f;
			}

			public float getAttackDamage() {
				return 5.699999999999999f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 52;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 0.199999999999999f, new Item.Properties().group(Thib1000ItemGroup.tab)) {
		}.setRegistryName("wetdirtpickaxe"));
	}
}
