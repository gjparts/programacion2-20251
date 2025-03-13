
package com.mycompany._string09;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Metodo indexOf
        Devuelve un numero entero con la posicion de la primer coincidencia
        encontrada para un String dentro de otro String.
        -> No ignora mayusculas/minusculas
        -> No altera al String
        -> Si no encuentra nada el entero devuelto es -1
        -> Si encuentra algo el entero devuelto sera >= 0
        -> Cuenta con un segundo parametro que es opcional para indicar
           a partir de donde vamos a comenzar a buscar.*/
        String str = "El carro es blanco con gris. El carro esta matriculado. El carro es Caro.";
        System.out.println(str);
        System.out.println("Posiciones de ciertas busquedas: ");
        System.out.println("gris: "+str.indexOf("gris"));
        System.out.println("matri: "+str.indexOf("matri"));
        System.out.println("llanta: "+str.indexOf("llanta"));
        System.out.println("GRIS: "+str.indexOf("GRIS"));
        System.out.println("CARO (ignorando el casing): "+str.toLowerCase().indexOf("caro"));
        //indexOf tiene una version que admite dos parametros:
        //1) el primer parametro es lo que deseamos buscar
        //2) el segundo parametro es a partir de que char vamos a comenzar a buscar
        //observen que carro esta tres veces en str, como obtenemos las posiciones
        //de esas tres coincidencias:
        System.out.println("Primer coincidencia de carro: "+str.indexOf("carro",0));
        System.out.println("Siguiente coincidencia de carro: "+str.indexOf("carro",4));
        System.out.println("Siguiente coincidencia de carro: "+str.indexOf("carro",33));
        System.out.println("Siguiente coincidencia de carro: "+str.indexOf("carro",60));
        //observe que en cada indexOf coloque la ultima posicion donde encontre
        //una coincidencia y le sume 1.
        String frutas = "manzana uva pera PERA MANZANA UVA kiwi toronja KIWI Manzana Uva";
        /*Hace un programa que le pregunte una fruta al usuario. El programa
        va a imprimir cuantas veces fue encontrada la fruta dentro del string
        llamado frutas. Ignorando mayusculas y minusculas. Ejemplo:
        Fruta a buscar: uva
        Veces que se ha encontrado: 3*/
        Scanner s = new Scanner(System.in);
        System.out.print("Fruta a buscar: ");
        String buscar = s.nextLine();
        int ultimaPosicion = 0; //variable bandera
        int coincidencias = 0; //contador
        
        while( ultimaPosicion >= 0 ){
            ultimaPosicion = frutas.toLowerCase().indexOf(buscar.toLowerCase(),ultimaPosicion);
            //si encontramos algo sumamos 1 al contador y sumamos 1 a la ultima posicion
            if( ultimaPosicion >= 0 ){
                coincidencias++;
                ultimaPosicion++;
            }
        }
        System.out.println("Veces que se ha encontrado: "+coincidencias);
    }
}
