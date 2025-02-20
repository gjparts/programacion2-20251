package com.mycompany._control_flujo_break;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*ejemplo de break
        usando una estructura de repeticion for hacer un programa
        que lea 100 numeros positivos de tipo long.
        -> si durante la lectura se digita un numero negativo terminar con
           la lectura de los 100 numeros.
        -> al finalizar el programa mostrar la suma de los numeros leidos;
           pero no sume el numero negativo leido para terminar con la estructura.*/
        Scanner s = new Scanner(System.in);
        long n, suma = 0;
        for(int i = 1; i <= 100; i++){
            System.out.print("Digite entero positivo: ");
            n = s.nextLong();
            if( n < 0 ) break; //si es un negativo termina con el for
            suma += n;
        }
        System.out.println("Suma de positivos: "+suma);
    }
}
