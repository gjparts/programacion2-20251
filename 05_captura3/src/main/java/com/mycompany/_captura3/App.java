/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._captura3;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*En una tienda se da un descuento de acuerdo al monto vendido.
        si el monto es mayor que 10000 entonces damos un descuento del 20%
        sobre el valor de la venta de lo contrario no damos descuento.
        Capturar el monto vendido e imprimir el valor del descuento y el
        valor final a pagar. ejemplos:

        Digitar monto vendido: 15000
        El descuento es: 3000
        El valor a pagar es: 12000

        otro ejemplo:
        Digitar monto vendido: 10000
        El descuento es: 0
        El valor a pagar es: 10000

        otro ejemplo:
        Digitar monto vendido: 5000
        El descuento es: 0
        El valor a pagar es: 5000*/
        Scanner s = new Scanner(System.in);
        double venta, descuento = 0;
        System.out.print("Digitar monto vendido: ");
        venta = s.nextDouble();
        
        //forma 1: calcular el descuento y guardarlo en una variable
        if( venta > 10000 )
            descuento = venta*0.20;
        
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar es: "+(venta-descuento));
        
        //forma 2: calcular directamente en la salida (no se almacena en variable)
        System.out.print("El descuento es: ");
        if( venta > 10000 )
            System.out.println(venta*0.20);
        else
            System.out.println(0.00);
        
        System.out.print("El valor a pagar es: ");
        if( venta > 10000 )
            System.out.println(venta-venta*0.20);
        else
            System.out.println(venta);
        
    }
}
