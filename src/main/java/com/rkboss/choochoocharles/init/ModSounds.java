package com.rkboss.choochoocharles.init;

import com.rkboss.choochoocharles.ChooChooCharlesMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, ChooChooCharlesMod.MODID);

    public static final DeferredHolder<SoundEvent, SoundEvent> NORMAL_TRAIN =
            SOUNDS.register("normal_train",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(ChooChooCharlesMod.MODID, "normal_train")));

    public static final DeferredHolder<SoundEvent, SoundEvent> CHARLES_DEATH =
            SOUNDS.register("charles_death",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(ChooChooCharlesMod.MODID, "charles_death")));
}
