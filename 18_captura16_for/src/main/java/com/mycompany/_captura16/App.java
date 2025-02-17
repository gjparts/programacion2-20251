package com.mycompany._captura16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        //forma 2: inicializar mayor en la primera iteracion
        Scanner s = new Scanner(System.in);
        double numero; //variable temporal para ir leyendo numero por numero
        double suma = 0; //variable acumulador para ir sumando
        //capturar los 10 numeros e irlos sumando a medida los leemos
        double mayor = 1234; //no importa que ponga aqui
        //10 iteraciones
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero double: ");
            numero = s.nextDouble();
            suma += numero; //suma = suma + numero;
            if( i == 1 ) mayor = numero; //mayor inicializa en numero recien leido
            //el numero recien leido lo comparamos con el numero mas grande actualmente
            if( numero > mayor )
                mayor = numero; //si lo supera el nuevo mayor es el numero recien leido
        }
        System.out.println("Suma: "+suma);
        System.out.println("El mayor es: "+mayor);
    }
}
