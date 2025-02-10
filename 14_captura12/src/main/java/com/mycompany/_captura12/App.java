package com.mycompany._captura12;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Estructura de seleccion switch: se basa en la seleccion
        de casos basados en el valor de una variable.
        En JAVA switch solo soporta numeros enteros.*/
        
        /*Hacer un programa que solicite digitar el numero
        de mes y el año como enteros. Luego va a imprimir un mensaje
        que indique la cantidad de dias que el mes/año proporcionado.
        IMPORTANTE: Recuerde que mes solo debe aceptar numeros entre 1 y 12
        Resuelvalo utilizando la estructura switch.*/
        Scanner s = new Scanner(System.in);
        int m,a;
        System.out.print("Anio: ");
        a = s.nextInt();
        System.out.print("Mes: ");
        m = s.nextInt();
        
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 dias");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");
            break;
            case 2:
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            break;
            default:
                System.out.println("Mes no valido");
        }
    }
}
