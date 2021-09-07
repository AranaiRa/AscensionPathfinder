package com.aranaira.ascpath.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.world.World;
import noobanidus.mods.carrierbees.entities.AppleBeeEntity;

public class LibeerianEntity extends AppleBeeEntity {
    public LibeerianEntity(EntityType<? extends LibeerianEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
            this.goalSelector.addGoal(1, new LibeerianEntity.HoneycombProjectileAttackGoal(this));
    }

    static class HoneycombProjectileAttackGoal extends Goal {
        private final LibeerianEntity parentEntity;
        public int attackTimer;

        public HoneycombProjectileAttackGoal(LibeerianEntity bee) {
            this.parentEntity = bee;
        }

        @Override
        public boolean shouldExecute() {
            return this.parentEntity.getAttackTarget() != null && this.parentEntity.isAngry();
        }

        @Override
        public void startExecuting() {
            this.attackTimer = 0;
        }

        @Override
        public boolean shouldContinueExecuting() {
            return this.parentEntity.isAngry();
        }

        @Override
        public void resetTask() {
            this.parentEntity.setAttackTarget(null);
            this.parentEntity.setAggroed(false);
            this.parentEntity.getNavigator().clearPath();
        }

        @Override
        public void tick() {
            LivingEntity livingentity = this.parentEntity.getAttackTarget();
            if (livingentity == null) {
                return;
            }
            if (livingentity.getDistanceSq(this.parentEntity) < 400D && this.parentEntity.canEntityBeSeen(livingentity)) {
                World world = this.parentEntity.world;
                ++this.attackTimer;
                if (this.attackTimer == 20) {
                    double d2 = livingentity.getPosX() - this.parentEntity.getPosX();
                    double d3 = livingentity.getPosYHeight(0.5D) - (0.5D + this.parentEntity.getPosYHeight(0.5D));
                    double d4 = livingentity.getPosZ() - this.parentEntity.getPosZ();
                    LibeerianBookEntity honeycomb = new LibeerianBookEntity(this.parentEntity, d2, d3, d4, world);
                    honeycomb.setPosition(this.parentEntity.getPosX(), this.parentEntity.getPosYHeight(0.5D) + 0.2D, honeycomb.getPosZ());
                    world.addEntity(honeycomb);
                    this.attackTimer = -40;
                }
            } else if (this.attackTimer > 0) {
                --this.attackTimer;
            }
        }

        public static AttributeModifierMap.MutableAttribute createAttributes() {
            return MobEntity.func_233666_p_()
                    .createMutableAttribute(Attributes.MAX_HEALTH, 16.0D)
                    .createMutableAttribute(Attributes.FLYING_SPEED, 0.6)
                    .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3)
                    .createMutableAttribute(Attributes.ATTACK_DAMAGE, 4.0D)
                    .createMutableAttribute(Attributes.FOLLOW_RANGE, 128.0D)
                    .createMutableAttribute(Attributes.ARMOR, 0)
                    .createMutableAttribute(Attributes.ARMOR_TOUGHNESS, 0)
                    ;
        }
    }
}
