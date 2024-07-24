/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cambiarcaracteres;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class CambiarCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String texto;

        System.out.print("Ingrese una palabra: ");
        texto = scanner.nextLine();

        System.out.print("Que letra desea reemplazar: ");
        char letraRe = scanner.next().charAt(0);

        System.out.print("Por cual la quiere reemplazar? ");
        char letraNu = scanner.next().charAt(0);

        String nuevotexto = texto.replace(letraRe, letraNu);

        System.out.println("El texto nuevo es: " + nuevotexto);

        scanner.close();
    }
}
