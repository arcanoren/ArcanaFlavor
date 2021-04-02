package net.arcano.arcanaflavor;

import net.arcano.arcanaflavor.registry.AFBlocks;
import net.arcano.arcanaflavor.registry.AFItems;
import net.fabricmc.api.ModInitializer;

public class ArcanaFlavor implements ModInitializer {

    public static final String MOD_ID = "arcanaflavor";

    @Override
    public void onInitialize() {
        AFItems.registerItems();
        AFBlocks.registerBlocks();
    }
}
