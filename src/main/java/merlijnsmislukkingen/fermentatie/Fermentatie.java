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
    static Fermentatieproces gemberbier = new Fermentatieproces();
    public static void main(String[] args){ 
        for (int i = 0; i<10; i++){
            double Biomassa = gemberbier.BiomassaBerekenen();
            System.err.println("Biomassa is: " + Biomassa);
        } 
    }
}
    

