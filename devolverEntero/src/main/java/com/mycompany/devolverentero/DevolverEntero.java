/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.devolverentero;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class DevolverEntero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, num2;

        System.out.println("Ingresa el primer numero entero: ");
        num = scanner.nextInt();
        System.out.println("Ingresa el segundo numero entero: ");
        num2 = scanner.nextInt();

        System.out.println("El maximo comun divisor es: " + funcion(num, num2));

        scanner.close();
    }

    public static int funcion(int num, int num2) {
        return num2 == 0 ? num : funcion(num2, num % num2);
    }
}
