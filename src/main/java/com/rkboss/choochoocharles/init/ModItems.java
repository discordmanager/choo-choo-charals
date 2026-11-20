package com.rkboss.choochoocharles.init;

import com.rkboss.choochoocharles.ChooChooCharlesMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ChooChooCharlesMod.MODID);

    public static final DeferredItem<Item> CHARLES_SPAWN_EGG = ITEMS.register("charles_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.CHARLES, 0x2B2B2B, 0xB81D13, new Item.Properties()));
}
