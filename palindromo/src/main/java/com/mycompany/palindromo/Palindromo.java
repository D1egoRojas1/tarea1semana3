/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("Ingresa una palabra: ");
        palabra = scanner.nextLine();
        
        if (funcion(palabra)) {
            System.out.println("La palabra " + palabra + " es palindromo.");
        } else {
            System.out.println("La palabra " + palabra + " no es palindromo.");
        }
    }
    
    public static boolean funcion (String palabra){
        
        String alreves = new StringBuilder(palabra).reverse().toString();
        
        return palabra.equals(alreves);
    }
}
