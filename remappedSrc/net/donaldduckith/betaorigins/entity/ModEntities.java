package net.donaldduckith.betaorigins.entity;

import net.donaldduckith.betaorigins.entity.vehicle.MinecartEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
        public static final EntityType<MinecartEntity> MINECART = Registry.register(Registries.ENTITY_TYPE,
                new Identifier("minecraft", "minecart"),
                FabricEntityTypeBuilder.create(SpawnGroup.MISC, MinecartEntity::new).dimensions(EntityDimensions.fixed(0.98f, 0.7f)).build());
    }
