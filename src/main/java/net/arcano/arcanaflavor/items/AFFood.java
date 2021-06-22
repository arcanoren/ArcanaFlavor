package net.arcano.arcanaflavor.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AFFood {



    private static Item food(int hunger, float saturation){
        return new Item(new Item.Settings().group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build()));
    }

    private static Item drink(int hunger, float saturation){
        return new AFDrinkable(new Item.Settings().group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build()));
    }

    //Raw
    public static final Item PUMPKIN_SLICE = food(1, 1);

    //Cooked
    public static final Item COOKED_APPLE = food(7, 6);
    public static final Item COOKED_BEETROOT = food(4, 5);
    public static final Item COOKED_CARROT = food(6, 7);
    public static final Item COOKED_PUMPKIN_SLICE = food(4, 2);

    //Pies
    public static final Item APPLE_PIE = food(9,6);
    public static final Item BEETROOT_PIE = food(7, 5.6F);
    public static final Item CHICKEN_PIE = food(11, 8);
    public static final Item CODFISH_PIE = food(7, 6);
    public static final Item MUSHROOM_PIE = food(8, 8);
    public static final Item SWEET_BERRY_PIE = food(6, 4);
    public static final Item VEGETABLE_PIE = food(12, 5.7F);
    public static final Item WART_PIE = food(8, 4.8F);

    //Cookies
    public static final Item BERRY_COOKIE = food(2, 0.4F);
    public static final Item CHOCOLATE_COOKIE = food(2, 0.4F);
    public static final Item HONEY_COOKIE = food(2, 0.4F);

    //Meat
    public static final Item BACON = food(4, 2);
    public static final Item BBQ = food(15, 18);
    public static final Item BURGER = food(2, 1.6F);
    public static final Item COOKED_MEATBALL = food(2, 1);
    public static final Item GRILLED_BACON = food(10, 11.5F);
    public static final Item GRILLED_BURGER = food(7, 10);
    public static final Item GRILLED_MUTTON_BURGER = food(8, 12);
    public static final Item GRILLED_SAUSAGE = food(5, 6.8F);
    public static final Item GROUND_MEAT = food(3, 1.6F);
    public static final Item GROUND_MUTTON = food(2, 1);
    public static final Item GROUND_PORK = food(3, 1.6F);
    public static final Item KEBAB = food(4, 5.2F);
    public static final Item MEATBALL = food(1, 0.4F);
    public static final Item MIXED_BBQ = food(14, 16);
    public static final Item MUTTON_BBQ = food(13, 12);
    public static final Item MUTTON_BURGER = food(3, 4.5F);
    public static final Item PEPPERONI = food(8, 7.8F);
    public static final Item RAW_KEBAB = food(1, 0.6F);
    public static final Item ROASTED_SALMON= food(4, 2.4F);
    public static final Item SASHIMI= food(2, 1.4F);
    public static final Item SAUSAGE= food(1, 0.6F);
    public static final Item SAUSAGE_BBQ= food(12, 9);
    public static final Item STUFFED_CHICKEN = food(19, 17.7F);

    //Drinks
    public static final Item MILK_BOTTLE = drink(1, 1);
    public static final Item APPLE_JUICE = drink(6, 3);
    public static final Item BEETROOT_JUICE = drink(3, 2);
    public static final Item BERRY_JUICE = drink(4, 1);
    public static final Item CACTUS_JUICE = drink(3, 1);
    public static final Item CARROT_JUICE = drink(5, 4);
    public static final Item CHORUS_JUICE = drink(6, 3);
    public static final Item MELON_JUICE = drink(4, 4);
    public static final Item SEA_PICKLE_JUICE = drink(3, 1);

}
