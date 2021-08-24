package com.aranaira.ascpath.client.models;// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.aranaira.ascpath.core.entity.LibeerianEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.ModelUtils;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.carrierbees.client.model.BodyModel;

@OnlyIn(Dist.CLIENT)
public class LibeerianModel extends BodyModel<LibeerianEntity> {
	private final ModelRenderer torso;
	private final ModelRenderer leftAntenna;
	private final ModelRenderer rightAntenna;
	private final ModelRenderer stinger;
	private final ModelRenderer rightWing;
	private final ModelRenderer leftWing;
	private final ModelRenderer frontLegs;
	private final ModelRenderer middleLegs;
	private final ModelRenderer backLegs;
	private float bodyPitch;

	public LibeerianModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.5F, 19.0F, 0.0F);


		torso = new ModelRenderer(this);
		torso.setRotationPoint(-0.5F, 5.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(0, 0).addBox(-3.0F, -9.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F, false);
		torso.setTextureOffset(41, 63).addBox(-2.5F, -4.5F, -5.5F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		torso.setTextureOffset(32, 48).addBox(-3.5F, -11.5F, -5.5F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		torso.setTextureOffset(41, 60).addBox(-2.5F, -8.5F, -5.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		torso.setTextureOffset(0, 56).addBox(3.5F, -4.0F, -3.0F, 2.0F, 3.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(0, 51).addBox(-4.5F, -4.0F, -3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		torso.setTextureOffset(0, 51).addBox(-4.5F, -4.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		leftAntenna = new ModelRenderer(this);
		leftAntenna.setRotationPoint(-0.5F, 5.0F, 0.0F);
		body.addChild(leftAntenna);
		leftAntenna.setTextureOffset(2, 0).addBox(2.0F, -9.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		rightAntenna = new ModelRenderer(this);
		rightAntenna.setRotationPoint(-0.5F, 5.0F, 0.0F);
		body.addChild(rightAntenna);
		rightAntenna.setTextureOffset(2, 3).addBox(-2.0F, -9.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		stinger = new ModelRenderer(this);
		stinger.setRotationPoint(0.0F, -1.0F, 1.0F);
		body.addChild(stinger);
		stinger.setTextureOffset(26, 7).addBox(0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		rightWing = new ModelRenderer(this);
		rightWing.setRotationPoint(-1.5F, -4.0F, -3.0F);
		body.addChild(rightWing);
		setRotationAngle(rightWing, 0.2618F, -0.2618F, 0.0F);
		rightWing.setTextureOffset(0, 18).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.0F, false);

		leftWing = new ModelRenderer(this);
		leftWing.setRotationPoint(1.5F, -4.0F, -3.0F);
		body.addChild(leftWing);
		setRotationAngle(leftWing, 0.2618F, 0.2618F, 0.0F);
		leftWing.setTextureOffset(9, 24).addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.0F, false);

		frontLegs = new ModelRenderer(this);
		frontLegs.setRotationPoint(1.5F, 3.0F, -2.0F);
		body.addChild(frontLegs);
		frontLegs.setTextureOffset(26, 1).addBox(-5.0F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, 0.0F, false);

		middleLegs = new ModelRenderer(this);
		middleLegs.setRotationPoint(1.5F, 3.0F, 0.0F);
		body.addChild(middleLegs);
		middleLegs.setTextureOffset(26, 3).addBox(-5.0F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, 0.0F, false);

		backLegs = new ModelRenderer(this);
		backLegs.setRotationPoint(1.5F, 3.0F, 2.0F);
		body.addChild(backLegs);
		backLegs.setTextureOffset(26, 5).addBox(-5.0F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setLivingAnimations(LibeerianEntity entity, float limbSwing, float limbSwingAmount, float partialTicks) {
		super.setLivingAnimations(entity, limbSwing, limbSwingAmount, partialTicks);
		this.bodyPitch = entity.getBodyPitch(partialTicks);
		this.stinger.showModel = !entity.hasStung();
	}

	@Override
	public void setRotationAngles(LibeerianEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightWing.rotateAngleX = 0.0F;
		this.leftAntenna.rotateAngleX = 0.0F;
		this.rightAntenna.rotateAngleX = 0.0F;
		this.body.rotateAngleX = 0.0F;
		this.body.rotationPointY = 19.0F;
		boolean onGround = entity.isOnGround() && entity.getMotion().lengthSquared() < 1.0E-7D;
		float v1;
		if (onGround) {
			this.rightWing.rotateAngleY = -0.2618F;
			this.rightWing.rotateAngleZ = 0.0F;
			this.leftWing.rotateAngleX = 0.0F;
			this.leftWing.rotateAngleY = 0.2618F;
			this.leftWing.rotateAngleZ = 0.0F;
			this.frontLegs.rotateAngleX = 0.0F;
			this.middleLegs.rotateAngleX = 0.0F;
			this.backLegs.rotateAngleX = 0.0F;
		} else {
			v1 = ageInTicks * 2.1F;
			this.rightWing.rotateAngleY = 0.0F;
			this.rightWing.rotateAngleZ = MathHelper.cos(v1) * 3.1415927F * 0.15F;
			this.leftWing.rotateAngleX = this.rightWing.rotateAngleX;
			this.leftWing.rotateAngleY = this.rightWing.rotateAngleY;
			this.leftWing.rotateAngleZ = -this.rightWing.rotateAngleZ;
			this.frontLegs.rotateAngleX = 0.7853982F;
			this.middleLegs.rotateAngleX = 0.7853982F;
			this.backLegs.rotateAngleX = 0.7853982F;
			this.body.rotateAngleX = 0.0F;
			this.body.rotateAngleY = 0.0F;
			this.body.rotateAngleZ = 0.0F;
		}

		if (!entity.isAngry()) {
			this.body.rotateAngleX = 0.0F;
			this.body.rotateAngleY = 0.0F;
			this.body.rotateAngleZ = 0.0F;
			if (!onGround) {
				float f1 = MathHelper.cos(ageInTicks * 0.18F);
				this.body.rotateAngleX = 0.1F + f1 * (float) Math.PI * 0.025F;
				this.leftAntenna.rotateAngleX = f1 * (float) Math.PI * 0.03F;
				this.rightAntenna.rotateAngleX = f1 * (float) Math.PI * 0.03F;
				this.frontLegs.rotateAngleX = -f1 * (float) Math.PI * 0.1F + ((float) Math.PI / 8F);
				this.backLegs.rotateAngleX = -f1 * (float) Math.PI * 0.05F + ((float) Math.PI / 4F);
				this.body.rotationPointY = 19.0F - MathHelper.cos(ageInTicks * 0.18F) * 0.9F;
			}
		}

		if (this.bodyPitch > 0.0F) {
			this.body.rotateAngleX = ModelUtils.func_228283_a_(this.body.rotateAngleX, 3.0915928F, this.bodyPitch);
		}
	}

	@Override
	protected Iterable<ModelRenderer> getHeadParts() {
		return ImmutableList.of();
	}

	@Override
	protected Iterable<ModelRenderer> getBodyParts() {
		return ImmutableList.of(body);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}