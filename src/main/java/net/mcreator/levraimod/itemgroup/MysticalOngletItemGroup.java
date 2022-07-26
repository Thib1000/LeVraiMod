
package net.mcreator.levraimod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.levraimod.block.MysticalGrassBlock;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class MysticalOngletItemGroup extends LeVraiModModElements.ModElement {
	public MysticalOngletItemGroup(LeVraiModModElements instance) {
		super(instance, 205);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmystical_onglet") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MysticalGrassBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
