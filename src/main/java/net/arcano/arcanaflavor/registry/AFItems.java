package net.arcano.arcanaflavor.registry;

import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.base.BaseFood;
import net.arcano.arcanaflavor.config.JsonGenerator;
import net.arcano.arcanaflavor.items.AFFood;
import net.arcano.arcanaflavor.items.AFItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;
import java.util.List;

public class AFItems {
    //Carregar Lista de comidas customizadas
    static List<BaseFood> customFoods = Arrays.asList(JsonGenerator.readConfig());
    //static BaseFood[] customFoods = JsonGenerator.readConfig();


    public static void itemRegistry(String name, Item item){
        for(BaseFood food : customFoods){
            //Comparar se variável foi alterada
            if(food.name != null && food.name.equals(name)){
                //Se sim, substiruir por nova comida
                if(food.name.contains("juice") || food.name.contains("bottle")){
                    item = AFFood.customDrink(food.hunger, food.saturation);
                }else{
                    item = AFFood.customFood(food.hunger, food.saturation);
                }

                System.out.println(food.name + " values replaced.");

                //customFoods.remove(food);
            }
        }

        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, name), item);
    }


    //Block Items Init
    public static final BlockItem COOKING_CAULDRON = new BlockItem(AFBlocks.COOKING_CAULDRON, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem EGG_CARTON_BLOCK = new BlockItem(AFBlocks.EGG_CARTON_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem CARROT_CAKE = new BlockItem(AFBlocks.CARROT_CAKE_BLOCK, new Item.Settings().maxCount(1).group(ItemGroup.FOOD));

    public static void registerItems(){

        /* *Foods* */

        //Raw
        itemRegistry("pumpkin_slice", AFFood.PUMPKIN_SLICE);

        //Cooked
        itemRegistry("cooked_apple", AFFood.COOKED_APPLE);
        itemRegistry("cooked_beetroot", AFFood.COOKED_BEETROOT);
        itemRegistry("cooked_carrot", AFFood.COOKED_CARROT);
        itemRegistry("cooked_pumpkin_slice", AFFood.COOKED_PUMPKIN_SLICE);

        //Pies
        itemRegistry("apple_pie", AFFood.APPLE_PIE);
        itemRegistry("beetroot_pie", AFFood.BEETROOT_PIE);
        itemRegistry("chicken_pie", AFFood.CHICKEN_PIE);
        itemRegistry("codfish_pie", AFFood.CODFISH_PIE);
        itemRegistry("glow_berries_pie", AFFood.GLOW_BERRIES_PIE);
        itemRegistry("mushroom_pie", AFFood.MUSHROOM_PIE);
        itemRegistry("sweet_berries_pie", AFFood.SWEET_BERRIES_PIE);
        itemRegistry("vegetable_pie", AFFood.VEGETABLE_PIE);
        itemRegistry("wart_pie", AFFood.WART_PIE);

        //Cookies
        itemRegistry("chocolate_cookie", AFFood.CHOCOLATE_COOKIE);
        itemRegistry("honey_cookie", AFFood.HONEY_COOKIE);
        itemRegistry("glow_berries_cookie", AFFood.GLOW_BERRIES_COOKIE);
        itemRegistry("sweet_berries_cookie", AFFood.SWEET_BERRIES_COOKIE);

        //Meat
        itemRegistry("bacon", AFFood.BACON);
        itemRegistry("bbq", AFFood.BBQ);
        itemRegistry("burger", AFFood.BURGER);
        itemRegistry("cooked_meatball", AFFood.COOKED_MEATBALL);
        itemRegistry("grilled_bacon", AFFood.GRILLED_BACON);
        itemRegistry("grilled_burger", AFFood.GRILLED_BURGER);
        itemRegistry("grilled_mutton_burger", AFFood.GRILLED_MUTTON_BURGER);
        itemRegistry("grilled_sausage", AFFood.GRILLED_SAUSAGE);
        itemRegistry("ground_meat", AFFood.GROUND_MEAT);
        itemRegistry("ground_mutton", AFFood.GROUND_MUTTON);
        itemRegistry("ground_pork", AFFood.GROUND_PORK);
        itemRegistry("kebab", AFFood.KEBAB);
        itemRegistry("meatball", AFFood.MEATBALL);
        itemRegistry("mixed_bbq", AFFood.MIXED_BBQ);
        itemRegistry("mutton_bbq", AFFood.MUTTON_BBQ);
        itemRegistry("mutton_burger", AFFood.MUTTON_BURGER);
        itemRegistry("pepperoni", AFFood.PEPPERONI);
        itemRegistry("raw_kebab", AFFood.RAW_KEBAB);
        itemRegistry("roasted_salmon", AFFood.ROASTED_SALMON);
        itemRegistry("sashimi", AFFood.SASHIMI);
        itemRegistry("sausage", AFFood.SAUSAGE);
        itemRegistry("sausage_bbq", AFFood.SAUSAGE_BBQ);
        itemRegistry("stuffed_chicken", AFFood.STUFFED_CHICKEN);

        //Drinks
        itemRegistry("milk_bottle", AFFood.MILK_BOTTLE);
        itemRegistry("apple_juice", AFFood.APPLE_JUICE);
        itemRegistry("beetroot_juice", AFFood.BEETROOT_JUICE);
        itemRegistry("cactus_juice", AFFood.CACTUS_JUICE);
        itemRegistry("carrot_juice", AFFood.CARROT_JUICE);
        itemRegistry("chorus_juice", AFFood.CHORUS_JUICE);
        itemRegistry("glow_berries_juice", AFFood.GLOW_BERRIES_JUICE);
        itemRegistry("melon_juice", AFFood.MELON_JUICE);
        itemRegistry("sea_pickle_juice", AFFood.SEA_PICKLE_JUICE);
        itemRegistry("sugar_cane_juice", AFFood.SUGAR_CANE_JUICE);
        itemRegistry("sweet_berries_juice", AFFood.SWEET_BERRIES_JUICE);

        /* *Items* */
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "egg_carton"), AFItem.EGG_CARTON);


        /* *Block Items* */
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "cooking_cauldron"), COOKING_CAULDRON);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "egg_carton_block"), EGG_CARTON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ArcanaFlavor.MOD_ID, "carrot_cake"), CARROT_CAKE);
    }
}
