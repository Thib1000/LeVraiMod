
package net.mcreator.levraimod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.levraimod.LeVraiModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrafthelppagedebaseGuiWindow extends ContainerScreen<CrafthelppagedebaseGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = CrafthelppagedebaseGui.guistate;

	public CrafthelppagedebaseGuiWindow(CrafthelppagedebaseGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/blaze_rod.png"));
		this.blit(ms, this.guiLeft + -118, this.guiTop + 28, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/millieu_des_elements.png"));
		this.blit(ms, this.guiLeft + -104, this.guiTop + 15, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/millieu_des_elements.png"));
		this.blit(ms, this.guiLeft + -70, this.guiTop + 29, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/ender_eye.png"));
		this.blit(ms, this.guiLeft + -58, this.guiTop + 20, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/millieu_des_elements.png"));
		this.blit(ms, this.guiLeft + -116, this.guiTop + 75, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/trident.png"));
		this.blit(ms, this.guiLeft + -103, this.guiTop + 84, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/millieu_des_elements.png"));
		this.blit(ms, this.guiLeft + -46, this.guiTop + 79, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/sun_block.png"));
		this.blit(ms, this.guiLeft + -60, this.guiTop + 67, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_nether.png"));
		this.blit(ms, this.guiLeft + -85, this.guiTop + 9, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_ender.png"));
		this.blit(ms, this.guiLeft + -37, this.guiTop + 10, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_overworld.png"));
		this.blit(ms, this.guiLeft + -76, this.guiTop + 55, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_renewed.png"));
		this.blit(ms, this.guiLeft + -22, this.guiTop + 58, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/croix_des_elements.png"));
		this.blit(ms, this.guiLeft + -20, this.guiTop + 111, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_renewed.png"));
		this.blit(ms, this.guiLeft + -113, this.guiTop + 135, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_ender.png"));
		this.blit(ms, this.guiLeft + -92, this.guiTop + 137, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/diamond.png"));
		this.blit(ms, this.guiLeft + -101, this.guiTop + 133, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_nether.png"));
		this.blit(ms, this.guiLeft + -112, this.guiTop + 158, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/diamond.png"));
		this.blit(ms, this.guiLeft + -112, this.guiTop + 147, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/diamond.png"));
		this.blit(ms, this.guiLeft + -101, this.guiTop + 160, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/diamond.png"));
		this.blit(ms, this.guiLeft + -91, this.guiTop + 147, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/baton_des_elements_overworld.png"));
		this.blit(ms, this.guiLeft + -91, this.guiTop + 158, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/millieu_des_elements.png"));
		this.blit(ms, this.guiLeft + -102, this.guiTop + 147, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/millieu_des_elements.png"));
		this.blit(ms, this.guiLeft + 285, this.guiTop + -12, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/end_stone.png"));
		this.blit(ms, this.guiLeft + 240, this.guiTop + 11, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/grass_block_side.png"));
		this.blit(ms, this.guiLeft + 215, this.guiTop + 11, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/diamond_block.png"));
		this.blit(ms, this.guiLeft + 240, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/nether_bricks.png"));
		this.blit(ms, this.guiLeft + 215, this.guiTop + 32, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/cnew.png"));
		this.blit(ms, this.guiLeft + 275, this.guiTop + 61, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/diamond_boots.png"));
		this.blit(ms, this.guiLeft + 227, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/dimension_ingot3.png"));
		this.blit(ms, this.guiLeft + 227, this.guiTop + 73, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/dimension_ingot3.png"));
		this.blit(ms, this.guiLeft + 226, this.guiTop + 104, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/sun_ingot_new.png"));
		this.blit(ms, this.guiLeft + 247, this.guiTop + 88, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("le_vrai_mod:textures/sun_ingot_new.png"));
		this.blit(ms, this.guiLeft + 205, this.guiTop + 88, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Crafting help", 51, -20, -16724992);
		this.font.drawString(ms, "Batons des elements", -118, -11, -1);
		this.font.drawString(ms, "Nether", -118, 8, -65485);
		this.font.drawString(ms, "Ender", -63, 8, -10066177);
		this.font.drawString(ms, "Overworld", -122, 56, -10027162);
		this.font.drawString(ms, "Renewed", -61, 56, -205);
		this.font.drawString(ms, "Croix des Elements", -117, 115, -1);
		this.font.drawString(ms, "Pepite des elements", 190, -9, -1);
		this.font.drawString(ms, "Bottes volantes", 197, 62, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 249, this.guiTop + 178, 45, 20, new StringTextComponent("Next"), e -> {
			if (true) {
				LeVraiModMod.PACKET_HANDLER.sendToServer(new CrafthelppagedebaseGui.ButtonPressedMessage(0, x, y, z));
				CrafthelppagedebaseGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
