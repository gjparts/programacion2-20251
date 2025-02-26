package com.mycompany._arreglos;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        /*Hacer un programa que tenga un arreglo unidimensional
        de numeros enteros de tamaño 25 y llenar cada uno de sus
        elementos con un numero al azar entre 5 y 97 no importa
        que se repitan. Por ultimo imprimir el arreglo.*/
        int arreglo[] = new int[25];
        Random r = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = r.nextInt(97-5+1)+5;
            System.out.println(arreglo[i]);
        }
        System.out.println("*****************************");
        /*crear un nuevo arreglo que sea una copia
        del arreglo del ejercicio anterior; pero en el nuevo
        arreglo va a tener cada uno de sus valores
        elevado al cuadrado. Imprimir el nuevo arreglo.*/
        int copia[] = new int[25];
        for (int i = 0; i < arreglo.length; i++) {
            //copia[i] = arreglo[i]*arreglo[i];
            copia[i] = (int)Math.pow(arreglo[i], 2);
            System.out.println(copia[i]);
        }
    }
}
