package net.arcano.arcanaflavor.registry;

import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.items.AFBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AFBlocks extends Block{
    public static final Block COOKING_CAULDRON = new Block(AbstractBlock.Settings.of(Material.METAL).strength(2.0F, 2.0F));
    public static final Block EGG_CARTON_BLOCK = new AFBlock(AbstractBlock.Settings.of(Material.SOLID_ORGANIC)
            .strength(0.2F, 0.2F).sounds(BlockSoundGroup.WART_BLOCK));

    public AFBlocks(Settings settings) {
        super(settings);
    }

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(ArcanaFlavor.MOD_ID, "cooking_cauldron"), COOKING_CAULDRON);
        Registry.register(Registry.BLOCK, new Identifier(ArcanaFlavor.MOD_ID, "egg_carton_block"), EGG_CARTON_BLOCK);
    }
}
