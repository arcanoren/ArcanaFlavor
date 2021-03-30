package net.arcano.arcanaflavor.registry;

import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.items.AFFood;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AFItems {
    public static void registerItems(){

        /* *Foods* */

        //Raw
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "pumpkin_slice"), AFFood.PUMPKIN_SLICE);

        //Cooked
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooked_apple"), AFFood.COOKED_APPLE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooked_beetroot"), AFFood.COOKED_BEETROOT);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooked_carrot"), AFFood.COOKED_CARROT);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooked_pumpkin_slice"), AFFood.COOKED_PUMPKIN_SLICE);

        //Pies
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "apple_pie"), AFFood.APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "beetroot_pie"), AFFood.BEETROOT_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "chicken_pie"), AFFood.CHICKEN_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "codfish_pie"), AFFood.CODFISH_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "mushroom_pie"), AFFood.MUSHROOM_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "sweet_berry_pie"), AFFood.SWEET_BERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "vegetable_pie"), AFFood.VEGETABLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "wart_pie"), AFFood.WART_PIE);
    }
}
