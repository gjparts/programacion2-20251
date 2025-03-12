package com.mycompany._string08;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Metodo contains
        Indica que si un String ha sido encontrado dentro de otro String
        -> no altera nada porque solo busca.
        -> no ignora mayusculas/minusculas.
        -> devuelve un boolean, true si se encontro, false si no se encontro.*/
        String str = "Hay una roca junto al CARACOL que esta a la orilla del mar.";
        System.out.println(str);
        System.out.println("str contiene la palabra oceano? "+str.contains("oceano"));
        System.out.println("str contiene la palabra roca? "+str.contains("roca"));
        System.out.println("str contiene la palabra ROCA? "+str.contains("ROCA"));
        System.out.println("str contiene la palabra ROCA ignorando mayusc/minusc? "+str.toLowerCase().contains("roca"));
        
        /*Pregunte al usuario un String, el programa va a buscar dicho String dentro de la variable str
        Si el texto es encontrado imprimir el mensaje: TEXTO ENCONTRADO de lo contrario imprimir
        TEXTO NO SE ENCONTRO.
        La busqueda debe ignorar mayusculas/minusculas.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite string a buscar: ");
        String buscar = s.nextLine();
        
        if( str.toLowerCase().contains( buscar.toLowerCase() ) == true )
            System.out.println("TEXTO ENCONTRADO");
        else
            System.out.println("TEXTO NO SE ENCONTRO");
    }
}
