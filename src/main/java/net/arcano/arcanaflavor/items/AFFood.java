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

}
