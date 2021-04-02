package net.arcano.arcanaflavor.registry;

import net.arcano.arcanaflavor.ArcanaFlavor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AFBlocks extends Block{
    public static final Block COOKING_CAULDRON = new Block(AbstractBlock.Settings.of(Material.METAL).strength(2.0F, 2.0F));

    public AFBlocks(Settings settings) {
        super(settings);
    }

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(ArcanaFlavor.MOD_ID, "cooking_cauldron"), COOKING_CAULDRON);
    }
}
