/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._while_dowhile;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Estructuras de repeticion while y do-while
        1) Generalmente se usan cuando no sabemos en que momento
           dejar de iterar puesto que se basan en el cumplimiento
           de una o varias condiciones.
        2) Para facilitar su entendimiento las imaginamos como si fueran
           una estructura if; solo que al cumplirse las condiciones lo que sucede
           es que iteramos, una vez se deje de cumplir las condiciones se deja de
           iterar.
        3) while: pregunta primero, hace despues
           do-while: hace primero, pregunta despues*/
        
        /*Hacer un programa que pregunte al usuario N cantidad de
        numeros positivos, el programa termina cuando se digita un numero
        negativo.*/
        Scanner s = new Scanner(System.in);
        //usando una estructura while:
        System.out.println("usando while:");
        double n = 0; //cuando usa while debe inicializar la variable de control
                      //de manera tal que al menos haga una iteracion
        while( n >= 0 ){
            System.out.print("Digite numero positivo: ");
            n = s.nextDouble();
        }
        System.out.println("Adios");
        
        //usando una estructura do-while
        System.out.println("usando do-while:");
        float x; //do-while siempre hace la primera iteracion, si la
                 //variable de control se escribe en cada iteracion
                 //no es necesario inicializarla en do-while.
        do{
            System.out.print("Digite numero positivo: ");
            x = s.nextFloat();
        }while( x >= 0 );
        System.out.println("Adios");
    }
}
