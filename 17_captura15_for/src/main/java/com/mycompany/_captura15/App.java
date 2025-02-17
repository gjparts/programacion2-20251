package com.mycompany._captura15;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        //forma 1: el mayor se inicializa con el numero mas pequeño soportado
        //por el tipo de dato que usamos
        Scanner s = new Scanner(System.in);
        double numero; //variable temporal para ir leyendo numero por numero
        double suma = 0; //variable acumulador para ir sumando
        //capturar los 10 numeros e irlos sumando a medida los leemos
        double mayor = Double.MAX_VALUE*-1; //variable bandera (flag) que determina
                      //cual es el numero mayor leido
                      //MAX_VALUE devuelve el numero mas grande permitido por el tipo
                      //si lo multiplica por -1 es el numero mas pequeno permitido
        //10 iteraciones
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero double: ");
            numero = s.nextDouble();
            suma += numero; //suma = suma + numero;
            //el numero recien leido lo comparamos con el numero mas grande actualmente
            if( numero > mayor )
                mayor = numero; //si lo supera el nuevo mayor es el numero recien leido
        }
        System.out.println("Suma: "+suma);
        System.out.println("El mayor es: "+mayor);
    }
}
