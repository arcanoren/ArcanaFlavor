package net.arcano.arcanaflavor.config;

import com.google.gson.Gson;
import net.arcano.arcanaflavor.base.BaseFood;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class JsonGenerator {

    public static BaseFood[] readConfig(){
        Gson config = new Gson();
        BaseFood[] customFoods = new BaseFood[0];

        try (Reader reader = new FileReader("..\\run\\config\\arcanaflavor.json")){
            customFoods = config.fromJson(reader, BaseFood[].class);

            if(customFoods != null){
                System.out.println(customFoods[0].name);
            }

        }catch (IOException e){
            System.out.println("Arquivo de configuração não encontrado");
            createConfig();
            System.out.println("Arquivo de configuração criado");
        }
        return customFoods;
    }

    public static void createConfig(){
        try{
            FileWriter writer = new FileWriter("..\\run\\config\\arcanaflavor.json");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Falha ao criar o arquivo de configuração!!!");
        }
    }
}
