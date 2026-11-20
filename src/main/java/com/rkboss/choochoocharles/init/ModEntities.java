package com.rkboss.choochoocharles.init;

import com.rkboss.choochoocharles.ChooChooCharlesMod;
import com.rkboss.choochoocharles.entity.CharlesEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, ChooChooCharlesMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<CharlesEntity>> CHARLES =
            ENTITIES.register("charles", () -> EntityType.Builder.of(CharlesEntity::new, MobCategory.MONSTER)
                    .sized(2.4F, 2.6F)
                    .clientTrackingRange(10)
                    .updateInterval(3)
                    .build(ResourceLocation.fromNamespaceAndPath(ChooChooCharlesMod.MODID, "charles").toString()));
}
