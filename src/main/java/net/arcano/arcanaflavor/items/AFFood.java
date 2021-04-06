package net.arcano.arcanaflavor.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AFFood {
    //Raw
    public static final Item PUMPKIN_SLICE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build()));

    //Cooked
    public static final Item COOKED_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(6).build()));
    public static final Item COOKED_BEETROOT = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(5).build()));
    public static final Item COOKED_CARROT = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(7).build()));
    public static final Item COOKED_PUMPKIN_SLICE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(2).build()));

    //Pies
    public static final Item APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(6).build()));
    public static final Item BEETROOT_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(5.6F).build()));
    public static final Item CHICKEN_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(11).saturationModifier(8).build()));
    public static final Item CODFISH_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(6).build()));
    public static final Item MUSHROOM_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(8).build()));
    public static final Item SWEET_BERRY_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(4).build()));
    public static final Item VEGETABLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(12).saturationModifier(5.7F).build()));
    public static final Item WART_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(4.8F).build()));

    //Cookies
    public static final Item BERRY_COOKIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build()));
    public static final Item CHOCOLATE_COOKIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build()));
    public static final Item HONEY_COOKIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build()));

    //Meat
    public static final Item BACON = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(2).build()));
    public static final Item BBQ = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(20).saturationModifier(20).build()));
    public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(1.6F).build()));
    public static final Item COOKED_MEATBALL = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(1).build()));
    public static final Item GRILLED_BACON = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(11.5F).build()));
    public static final Item GRILLED_BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(10).build()));
    public static final Item GRILLED_MUTTON_BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(12).build()));
    public static final Item GRILLED_SAUSAGE = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(6.8F).build()));
    public static final Item GROUND_MEAT = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6F).build()));
    public static final Item GROUND_MUTTON = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(1).build()));
    public static final Item GROUND_PORK = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6F).build()));
    public static final Item KEBAB = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(5.2F).build()));
    public static final Item MEATBALL = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4F).build()));
    public static final Item MIXED_BBQ = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(14).saturationModifier(19).build()));
    public static final Item MUTTON_BBQ = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(13).saturationModifier(12).build()));
    public static final Item MUTTON_BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(4.5F).build()));
    public static final Item PEPPERONI = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(8).saturationModifier(7.8F).build()));
    public static final Item RAW_KEBAB = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build()));
    public static final Item ROASTED_SALMON= new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F).build()));
    public static final Item SASHIMI= new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(1.4F).build()));
    public static final Item SAUSAGE= new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build()));
    public static final Item SAUSAGE_BBQ= new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(12).saturationModifier(9).build()));
    public static final Item STUFFED_CHICKEN = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(19).saturationModifier(16.7F).build()));

}
