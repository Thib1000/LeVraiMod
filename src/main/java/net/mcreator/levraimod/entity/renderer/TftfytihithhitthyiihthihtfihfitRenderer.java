
package net.mcreator.levraimod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.levraimod.entity.TftfytihithhitthyiihthihtfihfitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TftfytihithhitthyiihthihtfihfitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TftfytihithhitthyiihthihtfihfitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwarden(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("le_vrai_mod:textures/warden_2.png");
					}
				};
			});
		}
	}

	public static class Modelwarden extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer left_ear;
		private final ModelRenderer right_ear;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public Modelwarden() {
			textureWidth = 128;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -10.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, 0.0F, false);
			left_ear = new ModelRenderer(this);
			left_ear.setRotationPoint(8.0F, -22.5F, 0.0F);
			left_ear.setTextureOffset(106, 46).addBox(0.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			right_ear = new ModelRenderer(this);
			right_ear.setRotationPoint(-8.0F, -22.5F, 0.0F);
			right_ear.setTextureOffset(106, 36).addBox(-10.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -10.0F, 0.0F);
			body.setTextureOffset(0, 26).addBox(-9.0F, 0.0F, -5.0F, 18.0F, 21.0F, 11.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-11.0F, -6.0F, 0.0F);
			right_arm.setTextureOffset(52, 0).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(11.0F, -6.0F, 0.0F);
			left_arm.setTextureOffset(84, 0).addBox(-2.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(6.0F, 11.0F, 0.0F);
			left_leg.setTextureOffset(82, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-6.0F, 11.0F, 0.0F);
			right_leg.setTextureOffset(58, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
			right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

}
