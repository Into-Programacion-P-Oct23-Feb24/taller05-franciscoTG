/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ft110
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        entradaDatos.useLocale(Locale.US);
        int edad;
        double kilovatios_mes;
        double costo;
        double planilla_luz;
        System.out.println("Ingrese su edad");
        edad = entradaDatos.nextInt();
        System.out.println("Ingrese los kilovatios que consumió este mes");
        kilovatios_mes = entradaDatos.nextDouble();
        System.out.println("Ingrese el costo por hora que tienen los kilovatios");
        costo = entradaDatos.nextDouble();
        planilla_luz = (kilovatios_mes * costo);
        if (edad > 65) {
            planilla_luz = (planilla_luz - (planilla_luz * 0.10));
        }
        System.out.printf("Planilla de luz: %.2f", planilla_luz);

    }
}



        
     
 
