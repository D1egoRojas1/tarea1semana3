/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizcuadrada;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, raiz;
                
        System.out.print("Ingrese un numero: ");
        num = scanner.nextDouble();

        raiz = Math.sqrt(num);

        System.out.println(raiz + " es la raiz cuadrada de: " + num);

        scanner.close();
    }
}
