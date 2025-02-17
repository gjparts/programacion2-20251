package com.mycompany._captura17;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Hacer un programa que pida 10 numeros enteros, al finalizar
        mostrar el promedio de los numeros, asi como el conteo
        de cuantos numeros pares fueron leidos y cuantos numeros
        impares fueron leidos ademas de imprimir cual fue
        el numero mayor y el numero menor leido.*/
        Scanner s = new Scanner(System.in);
        int numero; //variable temporal
        int suma = 0, pares = 0, impares = 0; //variables acumuladoras
        int mayor = 7777, menor = 7777; //variables bandera (flag)
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero entero: ");
            numero = s.nextInt();
            suma += numero;
            //pares e impares
            if( numero%2 == 0 ) pares++; else impares++;
            //en la primera iteracion mayor y menor son el numero recien leido
            if( i == 1 ){
                mayor = numero;
                menor = numero;
            }
            //determinar el mayor y menor dependiendo del numero leido
            if( numero > mayor ) mayor = numero;
            //mayor = Math.max(numero,mayor);
            if( numero < menor ) menor = numero;
            //menor = Math.min(numero,menor);
        }
        System.out.println("El promedio es: "+(suma/10));
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }
}
