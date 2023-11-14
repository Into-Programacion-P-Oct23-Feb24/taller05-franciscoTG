/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ft110
 */
public class Problema01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base de su triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura de su triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;

        System.out.printf("b: %.2f\nh: %.2f\nArea: %.2f", base, altura, area);
    }
}

