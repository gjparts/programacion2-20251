/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura7;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Operador logico AND
        Hace obligatorio el cumplimiento de dos o mas condiciones.
        En lenguajes basados en C++ se representa usando doble ampersand: &&*/
        /*Pedir al usuario que digite los valores numericos para a, b, c
        Si a es mayor a 3 Y b es menor a 8 Y c es igual a 10 entonces
        mostrar el mensaje COMBINACION CORRECTA de lo contrario mostrar
        el mensaje COMBINACION INVALIDA.*/
        Scanner s = new Scanner(System.in);
        double a,b,c;
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();
        if( a > 3 && b < 8 && c == 10 )
            System.out.println("COMBINACION CORRECTA");
        else
            System.out.println("COMBINACION INVALIDA");
    }
}
