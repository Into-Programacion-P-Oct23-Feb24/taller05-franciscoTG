/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ft110
 */
public class Problema04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double total_computadora;

        System.out.println("Ingrese el valor de la CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el valor del raton");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla");
        pantalla = entrada.nextDouble();
        total_computadora = cpu + teclado + raton + pantalla;

        System.out.printf("El costo total de la computadora es: %.2f", total_computadora);
    }
}


