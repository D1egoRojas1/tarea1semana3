/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionprimo;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class FuncionPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        if (funcion(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }

        scanner.close();
    }
    
    public static boolean funcion(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}