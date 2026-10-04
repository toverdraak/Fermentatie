/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merlijnsmislukkingen.fermentatie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author merlijn
 */
public class Fermentatie {
    static ArrayList<Double> biomassaList = new ArrayList<>();
    static double firstBiomassa = 1;
    static double newBiomassa;
    static double factorenTotaal;
    public static void main(String[] args) {
        biomassaList.add(firstBiomassa);
        Parameters.parametersInput();
        while (factoren()>0) {
        calculation(factoren()); //omgeving!!!!!!!!!!!!!!!!!!
        System.err.println("biomassaLaatst " +biomassaList.get(biomassaList.size()-1));
        System.err.println("size "+ biomassaList.size());
        }
    }
    public static double factoren() {
        double suikerFactor = factorenSuiker();
        factorenTotaal = suikerFactor;
        return factorenTotaal;
    }
    public static Double factorenSuiker() {
//        double suikerFactor=Parameters.getParameters().get("suiker")/(Parameters.getParameters().get("snelheidsuiker")+Parameters.getParameters().get("suiker"));
        return Parameters.getParameters().get("suiker")/(Parameters.getParameters().get("snelheidsuiker")+Parameters.getParameters().get("suiker"));
    }
    public static void calculation(double omgeving) {
        newBiomassa = biomassaList.get(biomassaList.size()-1)+(omgeving*biomassaList.get(biomassaList.size()-1));
        biomassaList.add(newBiomassa);
        Parameters.updateParameters(biomassaList);
    }
}
    

