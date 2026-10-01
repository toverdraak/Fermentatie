/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merlijnsmislukkingen.fermentatie;

import java.util.Scanner;

/**
 *
 * @author merlijn
 */
public class Fermentatie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inTemperatuur = input.nextFloat();
        inTemperatuur = 5*(Math.round(inTemperatuur/5)); 
        System.err.println(inTemperatuur);
    }
}
