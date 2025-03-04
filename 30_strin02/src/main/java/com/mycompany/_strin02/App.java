package com.mycompany._strin02;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Capturar un String por medio de la consola usando Scanner*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un string: ");
        String str = s.nextLine();
        
        System.out.println("El String leido es: "+str);
        System.out.println("Longitud: "+str.length());
        System.out.println("En Mayusculas: "+str.toUpperCase());
        System.out.println("En Minusculas: "+str.toLowerCase());
        System.out.println("Sin relleno de espacios: "+str.trim());
        System.out.println("Longitud luego de trim: "+str.trim().length());
        //haga una copia de String recien leido en una nueva variable String
        //pero reemplazando la letra E por un 3, la letra A por un 4
        //ignorando mayusculas/minusculas sin usar replace.
        String copia = "";
        for (int i = 0; i < str.length(); i++) {
            if( str.toUpperCase().charAt(i) == 'E' )
                copia = copia + '3';
            else
                if( str.toUpperCase().charAt(i) == 'A' )
                    copia = copia + '4';
                else
                    copia = copia + str.charAt(i);
        }
        System.out.println("str luego de reemplazar: "+copia);
        
        //usando operador ternario
        copia = "";
        for (int i = 0; i < str.length(); i++)
            copia = copia + ( str.toUpperCase().charAt(i) == 'E' ? '3' : ( str.toUpperCase().charAt(i) == 'A' ? '4' : str.charAt(i) ) );
        
        System.out.println("str luego de reemplazar: "+copia);
    }
}
