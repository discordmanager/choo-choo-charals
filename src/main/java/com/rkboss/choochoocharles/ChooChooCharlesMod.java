package com.rkboss.choochoocharles;

import com.mojang.logging.LogUtils;
import com.rkboss.choochoocharles.entity.CharlesEntity;
import com.rkboss.choochoocharles.init.ModEntities;
import com.rkboss.choochoocharles.init.ModItems;
import com.rkboss.choochoocharles.init.ModSounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(ChooChooCharlesMod.MODID)
public class ChooChooCharlesMod {
    public static final String MODID = "choochoocharles";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHARLES_TAB =
            CREATIVE_TABS.register("charles_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MODID))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> ModItems.CHARLES_SPAWN_EGG.get().getDefaultInstance())
                    .displayItems((params, output) -> output.accept(ModItems.CHARLES_SPAWN_EGG.get()))
                    .build());

    public ChooChooCharlesMod(IEventBus modEventBus, ModContainer modContainer) {
        ModEntities.ENTITIES.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModSounds.SOUNDS.register(modEventBus);
        CREATIVE_TABS.register(modEventBus);

        modEventBus.addListener(this::registerAttributes);
    }

    private void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CHARLES.get(), CharlesEntity.createAttributes().build());
    }
}
