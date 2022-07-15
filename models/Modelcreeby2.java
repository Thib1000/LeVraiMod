// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelcreeby2 extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer FrontPaws;
	private final ModelRenderer BackPaws;
	private final ModelRenderer bb_main;

	public Modelcreeby2() {
		texWidth = 64;
		texHeight = 32;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 24.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 24.0F, 0.0F);
		Body.texOffs(19, 21).addBox(-3.0F, -10.0F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		FrontPaws = new ModelRenderer(this);
		FrontPaws.setPos(0.0F, 24.0F, 0.0F);
		FrontPaws.texOffs(2, 19).addBox(0.0F, -4.0F, -4.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		FrontPaws.texOffs(1, 19).addBox(-3.0F, -4.0F, -4.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		BackPaws = new ModelRenderer(this);
		BackPaws.setPos(0.0F, 24.0F, 0.0F);
		BackPaws.texOffs(2, 19).addBox(0.0F, -4.0F, 1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(1, 19).addBox(-3.0F, -4.0F, 1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontPaws.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BackPaws.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bb_main.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.BackPaws.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.FrontPaws.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Body.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}