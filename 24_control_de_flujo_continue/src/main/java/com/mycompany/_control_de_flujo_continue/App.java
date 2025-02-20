package com.mycompany._control_de_flujo_continue;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Instrucicones del control de flujo
        1) continue:    termina la iteracion actual y pasa a la siguiente
                        sin terminar con la estructura de repeticion;
        3) break:       termina con la estructura de repeticion.
        
        Ejemplo de como se usa continue
        Hacer un programa que imprima los numeros del 1 al 100;
        pero no imprima los numeros que sean multiplos de 9.
        RETO: resuelvalo usando la instruccion continue.
        */
        for( int i = 1; i <= 100; i++ ){
            if( i%9 == 0 ) continue;
            
            System.out.println(i);
        }
        /*Otro ejemplo:
        Leer N cantidad de numeros enteros, sume solo aquellos
        numeros que sean positivos. Si digita un numero negativo debera
        ignorarlo y seguir leyendo numeros.
        -> El programa termina cuando se digite el numero CERO
           y muestre la suma de los numeros leidos
        RETO: resuelvalo usando la instruccion continue.*/
        int n = 123;
        int suma = 0;
        Scanner s = new Scanner(System.in);
        while(n != 0){
            System.out.print("Digite entero positivo (cero termina): ");
            n = s.nextInt();
            if( n < 0 ) continue;
            suma += n;
            //System.out.println("Hasta digitado: "+n);
        }
        System.out.println("La suma de los positivos es: "+suma);
    }
}
