package fossilsarcheology.client.model;

import fossilsarcheology.server.entity.prehistoric.EntityPrehistoric;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPlatybelodon extends ModelPrehistoric {
    private final ModelAnimator animator;
    public AdvancedModelRenderer leftFrontLeg;
    public AdvancedModelRenderer rightFrontLeg;
    public AdvancedModelRenderer rightHindLeg;
    public AdvancedModelRenderer leftHindLeg;
    public AdvancedModelRenderer middleBody;
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer Tail;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer nose1;
    public AdvancedModelRenderer bottomjaw;
    public AdvancedModelRenderer EarL;
    public AdvancedModelRenderer EarR;
    public AdvancedModelRenderer nose2;
    public AdvancedModelRenderer TuskL1;
    public AdvancedModelRenderer TuskR1;
    public AdvancedModelRenderer nose3;
    public AdvancedModelRenderer nose4;
    public AdvancedModelRenderer TuskL2;
    public AdvancedModelRenderer TuskR2;
    public AdvancedModelRenderer shape34;
    public AdvancedModelRenderer shape35;

    public ModelPlatybelodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.lowerBody = new AdvancedModelRenderer(this, 0, 0);
        this.lowerBody.setRotationPoint(0.0F, 0.3F, 5.8F);
        this.lowerBody.addBox(-3.5F, -2.5F, 0.0F, 7, 9, 6, 0.0F);
        this.setRotateAngle(lowerBody, 0.04293509959906051F, -0.0F, 0.0F);
        this.nose2 = new AdvancedModelRenderer(this, 0, 42);
        this.nose2.setRotationPoint(0.0F, 0.4F, -4.7F);
        this.nose2.addBox(-1.5F, -1.0F, -3.9F, 3, 2, 4, 0.0F);
        this.setRotateAngle(nose2, 0.27314402793711257F, -0.0F, 0.0F);
        this.leftHindLeg = new AdvancedModelRenderer(this, 10, 15);
        this.leftHindLeg.mirror = true;
        this.leftHindLeg.setRotationPoint(3.1F, 11.3F, 13.2F);
        this.leftHindLeg.addBox(-1.0F, -1.0F, -1.5F, 2, 9, 3, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 0, 27);
        this.upperBody.mirror = true;
        this.upperBody.setRotationPoint(0.0F, 0.9F, 0.2F);
        this.upperBody.addBox(-3.5F, -3.5F, -5.0F, 7, 9, 6, 0.0F);
        this.setRotateAngle(upperBody, 0.08482300164692443F, -0.0F, 0.0F);
        this.bottomjaw = new AdvancedModelRenderer(this, 0, 48);
        this.bottomjaw.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.bottomjaw.addBox(-2.0F, -1.0F, -2.9F, 4, 2, 4, 0.0F);
        this.setRotateAngle(bottomjaw, 0.36425021489121656F, -0.0F, 0.0F);
        this.TuskL2 = new AdvancedModelRenderer(this, 16, 42);
        this.TuskL2.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.TuskL2.addBox(-0.5F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TuskL2, 0.22759093446006054F, 0.0F, 0.0F);
        this.middleBody = new AdvancedModelRenderer(this, 20, 9);
        this.middleBody.setRotationPoint(0.0F, 2.0F, -2.2F);
        this.middleBody.addBox(-3.0F, -2.5F, 0.0F, 6, 9, 7, 0.0F);
        this.setRotateAngle(middleBody, -0.08482300164692443F, -0.0F, 0.0F);
        this.shape35 = new AdvancedModelRenderer(this, 20, 48);
        this.shape35.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.shape35.addBox(-2.0F, -0.5F, -2.9F, 4, 1, 4, 0.0F);
        this.setRotateAngle(shape35, -0.33964107243809655F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 22, 38);
        this.head.mirror = true;
        this.head.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.head.addBox(-2.5F, -3.0F, -3.5F, 5, 6, 4, 0.0F);
        this.setRotateAngle(head, 0.2546435378659727F, -0.0F, 0.0F);
        this.shape34 = new AdvancedModelRenderer(this, 12, 47);
        this.shape34.setRotationPoint(0.0F, -0.4F, -3.0F);
        this.shape34.addBox(-1.5F, -0.5F, -2.8F, 3, 2, 3, 0.0F);
        this.setRotateAngle(shape34, 0.2972295716146343F, 0.0F, 0.0F);
        this.rightHindLeg = new AdvancedModelRenderer(this, 10, 15);
        this.rightHindLeg.mirror = true;
        this.rightHindLeg.setRotationPoint(-3.1F, 11.3F, 13.2F);
        this.rightHindLeg.addBox(-1.0F, -1.0F, -1.5F, 2, 9, 3, 0.0F);
        this.Tail = new AdvancedModelRenderer(this, 40, 38);
        this.Tail.setRotationPoint(0.0F, -0.5F, 5.4F);
        this.Tail.addBox(-0.5F, 0.0F, -0.2F, 1, 10, 1, 0.0F);
        this.setRotateAngle(Tail, 0.2546435378659727F, -0.0F, 0.0F);
        this.TuskR2 = new AdvancedModelRenderer(this, 16, 42);
        this.TuskR2.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.TuskR2.addBox(-0.5F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TuskR2, 0.22759093446006054F, 0.0F, 0.0F);
        this.EarL = new AdvancedModelRenderer(this, 40, 26);
        this.EarL.setRotationPoint(1.6F, -1.0F, -1.0F);
        this.EarL.addBox(0.0F, -1.0F, -0.5F, 4, 4, 1, 0.0F);
        this.setRotateAngle(EarL, 0.12740903539558604F, -0.8651597102135892F, -0.33964107243809655F);
        this.EarR = new AdvancedModelRenderer(this, 39, 8);
        this.EarR.mirror = true;
        this.EarR.setRotationPoint(-1.6F, -1.0F, -1.0F);
        this.EarR.addBox(-4.0F, -1.0F, -0.5F, 4, 4, 1, 0.0F);
        this.setRotateAngle(EarR, 0.12740903539558604F, 0.8651597102135892F, 0.33964107243809655F);
        this.TuskR1 = new AdvancedModelRenderer(this, 10, 42);
        this.TuskR1.setRotationPoint(-1.0F, 1.0F, -5.1F);
        this.TuskR1.addBox(-0.5F, -0.4F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(TuskR1, 0.7285004297824331F, -0.136659280431156F, 0.6829473363053812F);
        this.nose4 = new AdvancedModelRenderer(this, 20, 27);
        this.nose4.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.nose4.addBox(-1.0F, -1.0F, -2.8F, 2, 1, 3, 0.0F);
        this.setRotateAngle(nose4, 0.5094616086571448F, -0.0F, 0.0F);
        this.nose1 = new AdvancedModelRenderer(this, 26, 0);
        this.nose1.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.nose1.addBox(-2.0F, -1.0F, -5.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(nose1, 0.5009094953223726F, -0.0F, 0.0F);
        this.leftFrontLeg = new AdvancedModelRenderer(this, 0, 15);
        this.leftFrontLeg.mirror = true;
        this.leftFrontLeg.setRotationPoint(3.1F, 12.9F, -5.9F);
        this.leftFrontLeg.addBox(-1.0F, -1.0F, -1.5F, 2, 8, 3, 0.0F);
        this.rightFrontLeg = new AdvancedModelRenderer(this, 0, 15);
        this.rightFrontLeg.mirror = true;
        this.rightFrontLeg.setRotationPoint(-3.1F, 12.9F, -5.9F);
        this.rightFrontLeg.addBox(-1.0F, -1.0F, -1.5F, 2, 8, 3, 0.0F);
        this.TuskL1 = new AdvancedModelRenderer(this, 10, 42);
        this.TuskL1.setRotationPoint(1.0F, 1.0F, -5.1F);
        this.TuskL1.addBox(-0.5F, -0.4F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(TuskL1, 0.7285004297824331F, 0.136659280431156F, -0.6829473363053812F);
        this.nose3 = new AdvancedModelRenderer(this, 21, 0);
        this.nose3.setRotationPoint(0.0F, 0.0F, -3.6F);
        this.nose3.addBox(-1.0F, -1.0F, -2.8F, 2, 2, 3, 0.0F);
        this.setRotateAngle(nose3, 0.31869712141416456F, -0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 26, 25);
        this.neck.setRotationPoint(0.0F, -0.5F, -4.1F);
        this.neck.addBox(-2.0F, -2.5F, -4.5F, 4, 6, 6, 0.0F);
        this.setRotateAngle(neck, -0.091106186954104F, -0.0F, 0.0F);
        this.middleBody.addChild(this.lowerBody);
        this.nose1.addChild(this.nose2);
        this.middleBody.addChild(this.upperBody);
        this.head.addChild(this.bottomjaw);
        this.TuskL1.addChild(this.TuskL2);
        this.shape34.addChild(this.shape35);
        this.neck.addChild(this.head);
        this.bottomjaw.addChild(this.shape34);
        this.lowerBody.addChild(this.Tail);
        this.TuskR1.addChild(this.TuskR2);
        this.head.addChild(this.EarL);
        this.head.addChild(this.EarR);
        this.nose1.addChild(this.TuskR1);
        this.nose3.addChild(this.nose4);
        this.head.addChild(this.nose1);
        this.nose1.addChild(this.TuskL1);
        this.nose2.addChild(this.nose3);
        this.upperBody.addChild(this.neck);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.leftHindLeg.offsetX, this.leftHindLeg.offsetY, this.leftHindLeg.offsetZ);
        GlStateManager.translate(this.leftHindLeg.rotationPointX * f5, this.leftHindLeg.rotationPointY * f5, this.leftHindLeg.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.leftHindLeg.offsetX, -this.leftHindLeg.offsetY, -this.leftHindLeg.offsetZ);
        GlStateManager.translate(-this.leftHindLeg.rotationPointX * f5, -this.leftHindLeg.rotationPointY * f5, -this.leftHindLeg.rotationPointZ * f5);
        this.leftHindLeg.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.middleBody.offsetX, this.middleBody.offsetY, this.middleBody.offsetZ);
        GlStateManager.translate(this.middleBody.rotationPointX * f5, this.middleBody.rotationPointY * f5, this.middleBody.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.middleBody.offsetX, -this.middleBody.offsetY, -this.middleBody.offsetZ);
        GlStateManager.translate(-this.middleBody.rotationPointX * f5, -this.middleBody.rotationPointY * f5, -this.middleBody.rotationPointZ * f5);
        this.middleBody.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rightHindLeg.offsetX, this.rightHindLeg.offsetY, this.rightHindLeg.offsetZ);
        GlStateManager.translate(this.rightHindLeg.rotationPointX * f5, this.rightHindLeg.rotationPointY * f5, this.rightHindLeg.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.rightHindLeg.offsetX, -this.rightHindLeg.offsetY, -this.rightHindLeg.offsetZ);
        GlStateManager.translate(-this.rightHindLeg.rotationPointX * f5, -this.rightHindLeg.rotationPointY * f5, -this.rightHindLeg.rotationPointZ * f5);
        this.rightHindLeg.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.leftFrontLeg.offsetX, this.leftFrontLeg.offsetY, this.leftFrontLeg.offsetZ);
        GlStateManager.translate(this.leftFrontLeg.rotationPointX * f5, this.leftFrontLeg.rotationPointY * f5, this.leftFrontLeg.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.leftFrontLeg.offsetX, -this.leftFrontLeg.offsetY, -this.leftFrontLeg.offsetZ);
        GlStateManager.translate(-this.leftFrontLeg.rotationPointX * f5, -this.leftFrontLeg.rotationPointY * f5, -this.leftFrontLeg.rotationPointZ * f5);
        this.leftFrontLeg.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rightFrontLeg.offsetX, this.rightFrontLeg.offsetY, this.rightFrontLeg.offsetZ);
        GlStateManager.translate(this.rightFrontLeg.rotationPointX * f5, this.rightFrontLeg.rotationPointY * f5, this.rightFrontLeg.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.rightFrontLeg.offsetX, -this.rightFrontLeg.offsetY, -this.rightFrontLeg.offsetZ);
        GlStateManager.translate(-this.rightFrontLeg.rotationPointX * f5, -this.rightFrontLeg.rotationPointY * f5, -this.rightFrontLeg.rotationPointZ * f5);
        this.rightFrontLeg.render(f5);
        GlStateManager.popMatrix();
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoric prehistoric = (EntityPrehistoric) entity;
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(prehistoric.SPEAK_ANIMATION);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, head, -25, 0, 0);
        ModelUtils.rotate(animator, bottomjaw, 45, 0, 0);
        ModelUtils.rotate(animator, nose2, -15, 0, 0);
        ModelUtils.rotate(animator, nose3, -35, 0, 0);
        ModelUtils.rotate(animator, nose4, -35, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);

        animator.setAnimation(prehistoric.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        ModelUtils.rotate(animator, neck, 20, 0, 0);
        ModelUtils.rotate(animator, head, 20, 0, 0);
        ModelUtils.rotate(animator, nose3, 0, 0, 7);
        ModelUtils.rotate(animator, nose4, 0, 0, 10);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        ModelUtils.rotate(animator, neck, -15, 0, 0);
        ModelUtils.rotate(animator, head, -15, 0, 0);
        ModelUtils.rotate(animator, nose2, -30, 0, 0);
        ModelUtils.rotate(animator, nose3, -30, 0, 0);
        ModelUtils.rotate(animator, nose4, -30, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {this.Tail};
        AdvancedModelRenderer[] neckParts = {this.neck, this.head};
        AdvancedModelRenderer[] trunkParts = {this.nose2, this.nose3, this.nose4};
        if (((EntityPrehistoric) entity).isSkeleton() || ((EntityPrehistoric) entity).isAIDisabled()) {
            return;
        }
        ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
        ModelUtils.faceTargetMod(head, f3, f4, 0.5F);
        float speed = 0.1F;
        float speed2 = 0.7F;
        this.chainWave(tailParts, speed, 0.1F, -3, f2, 1);
        this.chainSwing(tailParts, speed, 0.07F, -2, f2, 1);
        this.chainWave(neckParts, speed, 0.07F, 3, f2, 1);
        this.chainWave(trunkParts, speed, 0.07F, 3, f2, 1);
        this.chainSwing(trunkParts, speed, 0.1F, -1, f2, 1);
        this.bob(middleBody, speed, 0.15F, false, f2, 1);
        this.walk(lowerBody, speed, 0.025F, true, 0F, 0F, f2, 1);
        this.walk(upperBody, speed, 0.025F, true, 0F, 0F, f2, 1);
        this.walk(bottomjaw, speed, 0.025F, true, 1F, -0.1F, f2, 1);
        this.walk(leftFrontLeg, speed2, 0.6F, true, 0F, -0.4F, f, f1);
        this.walk(rightFrontLeg, speed2, 0.6F, false, 0F, -0.4F, f, f1);
        this.walk(leftHindLeg, speed2, 0.6F, false, 0F, 0.4F, f, f1);
        this.walk(rightHindLeg, speed2, 0.6F, true, 0F, 0.4F, f, f1);
        {
            float sitProgress = ((EntityPrehistoric) (entity)).sitProgress;
            sitAnimationRotation(Tail, sitProgress, (float) Math.toRadians(20.87D), 0, 0);
            sitAnimationRotation(EarR, sitProgress, (float) Math.toRadians(5.0D), -((float) Math.toRadians(30.0D)), 0);
            sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(13.04D)), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(15.65D), 0, 0);
            sitAnimationRotation(head, sitProgress, (float) Math.toRadians(33.91D), 0, 0);
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(EarL, sitProgress, (float) Math.toRadians(5.0D), (float) Math.toRadians(30.0D), 0);
            sitAnimationRotation(middleBody, sitProgress, -((float) Math.toRadians(26.09D)), 0, 0);
            sitAnimationPos(middleBody, sitProgress, 0, 1.1F, 0);
            sitAnimationPos(leftHindLeg, sitProgress, 0, 0, -3);
            sitAnimationPos(rightHindLeg, sitProgress, 0, 0, -3);
        }
        {
            float sitProgress = ((EntityPrehistoric) (entity)).sleepProgress;
            sitAnimationRotation(nose3, sitProgress, (float) Math.toRadians(33.91D), -((float) Math.toRadians(15.65D)), -((float) Math.toRadians(2.61D)));
            sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(23.48D)), (float) Math.toRadians(7.83D), 0);
            sitAnimationRotation(middleBody, sitProgress, -((float) Math.toRadians(15.65D)), 0, -((float) Math.toRadians(110D)));
            sitAnimationRotation(nose4, sitProgress, (float) Math.toRadians(15.65D), -((float) Math.toRadians(18.26D)), -((float) Math.toRadians(13.04D)));
            sitAnimationRotation(rightHindLeg, sitProgress, 0, 0, -((float) Math.toRadians(86.09D)));
            sitAnimationRotation(EarL, sitProgress, (float) Math.toRadians(5.0D), (float) Math.toRadians(30.0D), 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(15.65D), 0, 0);
            sitAnimationRotation(leftFrontLeg, sitProgress, -((float) Math.toRadians(5.22D)), (float) Math.toRadians(2.61D), -((float) Math.toRadians(65.22D)));
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(Tail, sitProgress, (float) Math.toRadians(2.61D), (float) Math.toRadians(7.83D), (float) Math.toRadians(23.48D));
            sitAnimationRotation(nose1, sitProgress, -((float) Math.toRadians(32.87D)), 0, 0);
            sitAnimationRotation(head, sitProgress, (float) Math.toRadians(33.91D), (float) Math.toRadians(10.43D), -((float) Math.toRadians(10.43D)));
            sitAnimationRotation(nose2, sitProgress, -((float) Math.toRadians(7.83D)), -((float) Math.toRadians(7.83D)), (float) Math.toRadians(13.04D));
            sitAnimationRotation(EarR, sitProgress, (float) Math.toRadians(5.0D), -((float) Math.toRadians(30.0D)), 0);
            sitAnimationRotation(rightFrontLeg, sitProgress, -((float) Math.toRadians(26.09D)), 0, -((float) Math.toRadians(86.09D)));
            sitAnimationRotation(leftHindLeg, sitProgress, -((float) Math.toRadians(30D)), -((float) Math.toRadians(0)), -((float) Math.toRadians(70D)));
            sitAnimationPos(middleBody, sitProgress, -4.4F, 15F, 0.3F);
            sitAnimationPos(rightHindLeg, sitProgress, 8, 7F, -1);
            sitAnimationPos(leftHindLeg, sitProgress, 4F, 2F, -2F);
            sitAnimationPos(rightFrontLeg, sitProgress, 5F, 7F, 2F);
            sitAnimationPos(leftFrontLeg, sitProgress, 2F, 1F, 2F);
        }
    }
}
