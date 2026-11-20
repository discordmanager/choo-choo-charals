package com.rkboss.choochoocharles.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.rkboss.choochoocharles.ChooChooCharlesMod;
import com.rkboss.choochoocharles.entity.CharlesEntity;
import com.rkboss.choochoocharles.init.ModEntities;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = ChooChooCharlesMod.MODID, value = Dist.CLIENT)
public class CharlesClientEvents {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(ChooChooCharlesMod.MODID, "textures/entity/charles.png");

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.CHARLES.get(), ctx ->
                new HumanoidMobRenderer<CharlesEntity, HumanoidModel<CharlesEntity>>(
                        ctx, new HumanoidModel<>(ctx.bakeLayer(ModelLayers.ZOMBIE)), 1.0F) {
                    @Override
                    public ResourceLocation getTextureLocation(CharlesEntity entity) {
                        return TEXTURE;
                    }

                    @Override
                    protected void scale(CharlesEntity entity, PoseStack poseStack, float partialTickTime) {
                        poseStack.scale(2.0F, 2.0F, 2.0F);
                    }
                });
    }
}
