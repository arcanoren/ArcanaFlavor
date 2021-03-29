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
}
