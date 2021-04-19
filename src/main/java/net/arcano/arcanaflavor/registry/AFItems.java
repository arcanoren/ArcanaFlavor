package net.arcano.arcanaflavor.registry;

import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.items.AFFood;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AFItems {

    //Block Items Init
    public static final BlockItem COOKING_CAULDRON = new BlockItem(AFBlocks.COOKING_CAULDRON, new Item.Settings().group(ItemGroup.DECORATIONS));

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

        //Cookies
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "berry_cookie"), AFFood.BERRY_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "chocolate_cookie"), AFFood.CHOCOLATE_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "honey_cookie"), AFFood.HONEY_COOKIE);

        //Meat
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "bacon"), AFFood.BACON);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "bbq"), AFFood.BBQ);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "burger"), AFFood.BURGER);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooked_meatball"), AFFood.COOKED_MEATBALL);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "grilled_bacon"), AFFood.GRILLED_BACON);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "grilled_burger"), AFFood.GRILLED_BURGER);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "grilled_mutton_burger"), AFFood.GRILLED_MUTTON_BURGER);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "grilled_sausage"), AFFood.GRILLED_SAUSAGE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "ground_meat"), AFFood.GROUND_MEAT);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "ground_mutton"), AFFood.GROUND_MUTTON);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "ground_pork"), AFFood.GROUND_PORK);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "kebab"), AFFood.KEBAB);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "meatball"), AFFood.MEATBALL);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "mixed_bbq"), AFFood.MIXED_BBQ);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "mutton_bbq"), AFFood.MUTTON_BBQ);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "mutton_burger"), AFFood.MUTTON_BURGER);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "pepperoni"), AFFood.PEPPERONI);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "raw_kebab"), AFFood.RAW_KEBAB);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "roasted_salmon"), AFFood.ROASTED_SALMON);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "sashimi"), AFFood.SASHIMI);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "sausage"), AFFood.SAUSAGE);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "sausage_bbq"), AFFood.SAUSAGE_BBQ);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "stuffed_chicken"), AFFood.STUFFED_CHICKEN);

        //Drinks
        Registry.register(Registry.ITEM,new Identifier(ArcanaFlavor.MOD_ID, "milk_bottle"), AFFood.MILK_BOTTLE);


        /* *Block Items* */
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooking_cauldron"), COOKING_CAULDRON);
    }
}
