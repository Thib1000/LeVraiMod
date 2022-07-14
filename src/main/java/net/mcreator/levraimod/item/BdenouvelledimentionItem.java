
package net.mcreator.levraimod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.levraimod.itemgroup.Thib1000ItemGroup;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class BdenouvelledimentionItem extends LeVraiModModElements.ModElement {
	@ObjectHolder("le_vrai_mod:bdenouvelledimention")
	public static final Item block = null;

	public BdenouvelledimentionItem(LeVraiModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(Thib1000ItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("bdenouvelledimention");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 1;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
