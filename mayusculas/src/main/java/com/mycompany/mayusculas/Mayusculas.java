/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayusculas;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Mayusculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("Ingrese una palabra: ");
        palabra = scanner.nextLine();
        
        if (!palabra.trim().isEmpty()) {
            System.out.println("Texto en mayusculas: " + palabra.toUpperCase());
            }
        else {
            System.out.println("No se ingreso ninguna palabra.");
        }
    }
}
