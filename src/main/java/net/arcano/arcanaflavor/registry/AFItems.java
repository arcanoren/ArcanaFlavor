package net.arcano.arcanaflavor.registry;

import me.shedaniel.autoconfig.AutoConfig;
import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.base.BaseFood;
import net.arcano.arcanaflavor.config.AFConfig;
import net.arcano.arcanaflavor.items.AFDrinkable;
import net.arcano.arcanaflavor.items.AFFood;
import net.arcano.arcanaflavor.items.AFItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class AFItems {

    public static void verifyCustomFoodsRegistry(String name, Item item){
        BaseFood food = new BaseFood();
        ArcanaFlavor.CONFIG.parseJson(name, food);

        if (food.name != null && food.name.contains("_custom")) {
            if(food.name.contains("juice") || food.name.contains("bottle")){
                item = new AFDrinkable(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder()
                        .hunger(food.hunger).saturationModifier(food.saturation).alwaysEdible().build()));
            }else {
                item = new Item(new Item.Settings().group(ItemGroup.FOOD)
                        .food(new FoodComponent.Builder().hunger(food.hunger).saturationModifier(food.saturation).build()));
            }

            System.out.println(name + " values replaced!");
        }

        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, name), item);
    }


    //Block Items Init
    public static final BlockItem COOKING_CAULDRON = new BlockItem(AFBlocks.COOKING_CAULDRON, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem EGG_CARTON_BLOCK = new BlockItem(AFBlocks.EGG_CARTON_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registerItems(){

        /* *Foods* */

        //Raw
        verifyCustomFoodsRegistry("pumpkin_slice", AFFood.PUMPKIN_SLICE);

        //Cooked
        verifyCustomFoodsRegistry("cooked_apple", AFFood.COOKED_APPLE);
        verifyCustomFoodsRegistry("cooked_beetroot", AFFood.COOKED_BEETROOT);
        verifyCustomFoodsRegistry("cooked_carrot", AFFood.COOKED_CARROT);
        verifyCustomFoodsRegistry("cooked_pumpkin_slice", AFFood.COOKED_PUMPKIN_SLICE);

        //Pies
        verifyCustomFoodsRegistry("apple_pie", AFFood.APPLE_PIE);
        verifyCustomFoodsRegistry("beetroot_pie", AFFood.BEETROOT_PIE);
        verifyCustomFoodsRegistry("chicken_pie", AFFood.CHICKEN_PIE);
        verifyCustomFoodsRegistry("codfish_pie", AFFood.CODFISH_PIE);
        verifyCustomFoodsRegistry("glow_berries_pie", AFFood.GLOW_BERRIES_PIE);
        verifyCustomFoodsRegistry("mushroom_pie", AFFood.MUSHROOM_PIE);
        verifyCustomFoodsRegistry("sweet_berries_pie", AFFood.SWEET_BERRIES_PIE);
        verifyCustomFoodsRegistry("vegetable_pie", AFFood.VEGETABLE_PIE);
        verifyCustomFoodsRegistry("wart_pie", AFFood.WART_PIE);

        //Cookies
        verifyCustomFoodsRegistry("chocolate_cookie", AFFood.CHOCOLATE_COOKIE);
        verifyCustomFoodsRegistry("honey_cookie", AFFood.HONEY_COOKIE);
        verifyCustomFoodsRegistry("glow_berries_cookie", AFFood.GLOW_BERRIES_COOKIE);
        verifyCustomFoodsRegistry("sweet_berries_cookie", AFFood.SWEET_BERRIES_COOKIE);

        //Meat
        verifyCustomFoodsRegistry("bacon", AFFood.BACON);
        verifyCustomFoodsRegistry("bbq", AFFood.BBQ);
        verifyCustomFoodsRegistry("burger", AFFood.BURGER);
        verifyCustomFoodsRegistry("cooked_meatball", AFFood.COOKED_MEATBALL);
        verifyCustomFoodsRegistry("grilled_bacon", AFFood.GRILLED_BACON);
        verifyCustomFoodsRegistry("grilled_burger", AFFood.GRILLED_BURGER);
        verifyCustomFoodsRegistry("grilled_mutton_burger", AFFood.GRILLED_MUTTON_BURGER);
        verifyCustomFoodsRegistry("grilled_sausage", AFFood.GRILLED_SAUSAGE);
        verifyCustomFoodsRegistry("ground_meat", AFFood.GROUND_MEAT);
        verifyCustomFoodsRegistry("ground_mutton", AFFood.GROUND_MUTTON);
        verifyCustomFoodsRegistry("ground_pork", AFFood.GROUND_PORK);
        verifyCustomFoodsRegistry("kebab", AFFood.KEBAB);
        verifyCustomFoodsRegistry("meatball", AFFood.MEATBALL);
        verifyCustomFoodsRegistry("mixed_bbq", AFFood.MIXED_BBQ);
        verifyCustomFoodsRegistry("mutton_bbq", AFFood.MUTTON_BBQ);
        verifyCustomFoodsRegistry("mutton_burger", AFFood.MUTTON_BURGER);
        verifyCustomFoodsRegistry("pepperoni", AFFood.PEPPERONI);
        verifyCustomFoodsRegistry("raw_kebab", AFFood.RAW_KEBAB);
        verifyCustomFoodsRegistry("roasted_salmon", AFFood.ROASTED_SALMON);
        verifyCustomFoodsRegistry("sashimi", AFFood.SASHIMI);
        verifyCustomFoodsRegistry("sausage", AFFood.SAUSAGE);
        verifyCustomFoodsRegistry("sausage_bbq", AFFood.SAUSAGE_BBQ);
        verifyCustomFoodsRegistry("stuffed_chicken", AFFood.STUFFED_CHICKEN);

        //Drinks
        verifyCustomFoodsRegistry("milk_bottle", AFFood.MILK_BOTTLE);
        verifyCustomFoodsRegistry("apple_juice", AFFood.APPLE_JUICE);
        verifyCustomFoodsRegistry("beetroot_juice", AFFood.BEETROOT_JUICE);
        verifyCustomFoodsRegistry("cactus_juice", AFFood.CACTUS_JUICE);
        verifyCustomFoodsRegistry("carrot_juice", AFFood.CARROT_JUICE);
        verifyCustomFoodsRegistry("chorus_juice", AFFood.CHORUS_JUICE);
        verifyCustomFoodsRegistry("glow_berries_juice", AFFood.GLOW_BERRIES_JUICE);
        verifyCustomFoodsRegistry("melon_juice", AFFood.MELON_JUICE);
        verifyCustomFoodsRegistry("sea_pickle_juice", AFFood.SEA_PICKLE_JUICE);
        verifyCustomFoodsRegistry("sugar_cane_juice", AFFood.SUGAR_CANE_JUICE);
        verifyCustomFoodsRegistry("sweet_berries_juice", AFFood.SWEET_BERRIES_JUICE);

        /* *Items* */
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "egg_carton"), AFItem.EGG_CARTON);


        /* *Block Items* */
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooking_cauldron"), COOKING_CAULDRON);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "egg_carton_block"), EGG_CARTON_BLOCK);
    }
}
