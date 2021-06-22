package net.arcano.arcanaflavor.config;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.arcano.arcanaflavor.ArcanaFlavor;
import net.arcano.arcanaflavor.base.BaseFood;

@Config(name = ArcanaFlavor.MOD_ID)
public class AFConfig implements ConfigData{

    public void parseJson(String name, BaseFood food){
        JsonObject obj;

        if (customFood != null){
            for(JsonElement element: customFood){
                obj = (JsonObject) element;

                if(obj.get("name").toString().replace("\"", "").equals(name)){
                    food.name = obj.get("name").toString().replace("\"", "") + "_custom";
                    food.hunger = obj.get("hunger").getAsInt();
                    food.saturation = obj.get("saturation").getAsFloat();

                    break;
                }
            }
        }
    }

    @ConfigEntry.Gui.Tooltip
    public JsonArray customFood = new JsonArray();
}
