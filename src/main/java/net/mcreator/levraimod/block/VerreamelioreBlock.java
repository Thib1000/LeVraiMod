
package net.mcreator.levraimod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.levraimod.itemgroup.Thib1000ItemGroup;
import net.mcreator.levraimod.LeVraiModModElements;

import java.util.List;
import java.util.Collections;

@LeVraiModModElements.ModElement.Tag
public class VerreamelioreBlock extends LeVraiModModElements.ModElement {
	@ObjectHolder("le_vrai_mod:verreameliore")
	public static final Block block = null;

	public VerreamelioreBlock(LeVraiModModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(Thib1000ItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
	}

	public static class CustomBlock extends PaneBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid()
					.setOpaque((bs, br, bp) -> false));
			setRegistryName("verreameliore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
