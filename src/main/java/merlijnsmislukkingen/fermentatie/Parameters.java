/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merlijnsmislukkingen.fermentatie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author merlijn
 */
public class Parameters {
    static Map<String, Double> parameters = new HashMap<>();
    static double biomassaPerSuiker = 0.12;
    public static void parametersInput(){
        Scanner input = new Scanner(System.in);
    //temperatuur
        double inTemperatuur = input.nextFloat();
        inTemperatuur = 5*(Math.round(inTemperatuur/5)); 
        System.err.println(inTemperatuur);
        double TemperatuurFactor = 0.7; //!!!!!!!
        parameters.put("temperatuur", TemperatuurFactor); 
    //Maximale snelheid !!
        double maxSnelheid = 0.35;
        parameters.put("maximumsnelheid", maxSnelheid); 
    //Suiker !!
        double suikerBeschikbaar = 100;
        parameters.put("suiker", suikerBeschikbaar); 
    //SuikerInvloed
        double groeiSnelheidSuikerParameter = 10; 
        parameters.put("snelheidsuiker", groeiSnelheidSuikerParameter); 
    }
    public static void updateParameters(ArrayList<Double> biomassaList) {
        parameters.put("suiker",(parameters.get("suiker")- ((biomassaList.get(biomassaList.size()-1)-biomassaList.get(biomassaList.size()-2))/biomassaPerSuiker)));
        System.err.println("suiker == " +parameters.get("suiker"));
    }

    public static Map<String, Double> getParameters() {
        return parameters;
    }
    
}
