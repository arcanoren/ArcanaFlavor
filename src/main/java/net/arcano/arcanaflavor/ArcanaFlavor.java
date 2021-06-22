package net.arcano.arcanaflavor;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.arcano.arcanaflavor.config.AFConfig;
import net.arcano.arcanaflavor.registry.AFBlocks;
import net.arcano.arcanaflavor.registry.AFItems;
import net.fabricmc.api.ModInitializer;

public class ArcanaFlavor implements ModInitializer {

    public static final String MOD_ID = "arcanaflavor";

    public static AFConfig CONFIG;

    @Override
    public void onInitialize() {
        AutoConfig.register(AFConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(AFConfig.class).getConfig();

        AFItems.registerItems();
        AFBlocks.registerBlocks();
    }
}
