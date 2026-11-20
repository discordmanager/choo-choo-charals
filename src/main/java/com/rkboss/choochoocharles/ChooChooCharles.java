package com.rkboss.choochoocharles;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ChooChooCharles.MOD_ID)
public class ChooChooCharles {

    public static final String MOD_ID = "choochoocharles";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ChooChooCharles(IEventBus modEventBus) {
        LOGGER.info("Choo Choo Charles mod is loading!");
    }
}
