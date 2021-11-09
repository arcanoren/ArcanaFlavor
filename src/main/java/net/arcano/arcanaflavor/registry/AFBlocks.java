package net.arcano.arcanaflavor.registry;

import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.blocks.AFBlock;
import net.arcano.arcanaflavor.blocks.AFCakeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AFBlocks extends net.minecraft.block.Block {
    public static final net.minecraft.block.Block COOKING_CAULDRON = new net.minecraft.block.Block(AbstractBlock.Settings.of(Material.METAL).strength(2.0F, 2.0F));
    public static final net.minecraft.block.Block EGG_CARTON_BLOCK = new AFBlock(AbstractBlock.Settings.of(Material.SOLID_ORGANIC)
            .strength(0.2F, 0.2F).sounds(BlockSoundGroup.WART_BLOCK));
    public static final net.minecraft.block.Block CARROT_CAKE_BLOCK = new AFCakeBlock(AbstractBlock.Settings.of(Material.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL));

    public AFBlocks(Settings settings) {
        super(settings);
    }

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(ArcanaFlavor.MOD_ID, "cooking_cauldron"), COOKING_CAULDRON);
        Registry.register(Registry.BLOCK, new Identifier(ArcanaFlavor.MOD_ID, "egg_carton_block"), EGG_CARTON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(ArcanaFlavor.MOD_ID, "carrot_cake_block"), CARROT_CAKE_BLOCK);
    }
}
