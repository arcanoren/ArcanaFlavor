# Arcana Flavor

This mod make the cooking task more tasty.

The objective of this mod is to bring more food options to the player, so that it is not limited to the effectiveness of a single food.

## License

This mod is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.

## WIKI

### Customizing Mod Foods
To customize the hunger and saturation value of a food, go to config folder and open arcanaflavor.json file.

In the customFood:[ ] field add the id of thw food you want edit, such as hunger and saturation in the following format:

{

    customFood:[
        {
            "name":"food_id",
            "hunger": 2,  //new hunger value
            "saturation": 1 //new saturation value
        },
        {
            "name": "food_id_2",
            "hunger": 0
            "saturation": 0
        }
    ]

}

PS: To know the id of the food what you wish to customize, press F3 + H in game and the id will be displayed by item
tooltip.
