/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura10;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Operador Logico OR
        Evalua que se cumpla al menos una condicion dentro de un conjunto
        de condiciones.
        -> En C++, JAVA, C#, javascript, Dart, PHP se usan dos
           barras para representar a OR:  || 
        -> La barra es el caracter 124
        
        Hacer un programa que solicite digitar el numero
        de mes y el año como enteros. Luego va a imprimir un mensaje
        que indique la cantidad de dias que el mes/año proporcionado.
        IMPORTANTE: Recuerde que mes solo debe aceptar numeros entre 1 y 12*/
        Scanner s = new Scanner(System.in);
        int m,a;
        System.out.print("Digite el mes: ");
        m = s.nextInt();
        System.out.print("Digite el anio: ");
        a = s.nextInt();
        //validar si el mes esta entre 1 y 12
        if( m >= 1 && m <= 12 ){
            if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
                System.out.println("31 dias");
            
            if( m == 4 || m == 6 || m == 9 || m == 11 )
                System.out.println("30 dias");
            
            if( m == 2 ){
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            }
        }
        else
            System.out.println("Mes debe ser entre 1 y 12");
    }
}
