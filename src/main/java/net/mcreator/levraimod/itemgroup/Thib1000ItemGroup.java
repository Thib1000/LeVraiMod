
package net.mcreator.levraimod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.levraimod.item.RubyItem;
import net.mcreator.levraimod.LeVraiModModElements;

@LeVraiModModElements.ModElement.Tag
public class Thib1000ItemGroup extends LeVraiModModElements.ModElement {
	public Thib1000ItemGroup(LeVraiModModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthib_1000") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
