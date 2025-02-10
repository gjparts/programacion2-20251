package com.mycompany._captura11;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Una tienda da un descuento del 10% a personas
        cuya edad este entre 18 y 21 o entre 35 y 59.
        Preguntar al usuario la edad y el monto de la venta.
        Imprimir lo que tiene que pagar y el monto del
        descuento otorgado.
        Obligatorio realizarlo utilizando los operadores AND OR*/
        Scanner s = new Scanner(System.in);
        float venta, descuento = 0;
        int edad;
        System.out.print("Digite el monto de la venta: ");
        venta = s.nextFloat();
        System.out.print("Digite la edad del cliente: ");
        edad = s.nextInt();
        
        if( edad >= 18 && edad <= 21 || edad >= 35 && edad <= 59 )
            descuento = venta*0.10f;
        
        System.out.println("El descuento es: "+descuento);
        System.out.println("Total a pagar: "+(venta-descuento));
    }
}
