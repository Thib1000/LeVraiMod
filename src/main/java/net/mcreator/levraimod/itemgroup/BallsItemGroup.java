
package net.mcreator.levraimod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.levraimod.item.LeatherballItem;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class BallsItemGroup extends LeVraiModModElements.ModElement {
	public BallsItemGroup(LeVraiModModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabballs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LeatherballItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
