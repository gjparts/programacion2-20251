package com.mycompany._string10;
public class App {
    public static void main(String[] args) {
        /*Metodo substring
        Devuelve un String que esta dentro de otro String. En JAVA
        hay dos maneras de usarlo:
        1)  substring(posicion_inicial)
            Devuelve un String desde la posicion inicial hasta el final del String.
        2)  substring(posicion_inicial, posicion_final)
            Devuelve un String desde la posicion inicial hasta la posicion final
        -> substring devuelve incluye el char de la posicion inicial; pero
           no incluye al char de la posicion final, esto en JAVA.*/
        String str = "El veloz murcielago hindu comia feliz kiwi y cardillo.";
        System.out.println(str);
        //substring desde la posicion 0 hasta la posicion 7:
        System.out.println( str.substring(0, 7) );
        //substyring desde la posicion 5 hasta la 1000
        //substring no permite acceder a una posicion que no existe, en este caso
        //el caracter 1000 no existe en str.
        //System.out.println( str.substring(5, 1000) );
        
        //substring desde la posicion 8 hasta la posicion 23
        System.out.println( str.substring(8, 23) );
        
        //substring desde la posicion 20 hasta la posicion 5
        //esto da error porque la posicion inicial siempre debe de ser
        //menor a la posicion final, esto en JAVA
        //System.out.println( str.substring(20, 5) );
        
        //ejemplo solo utilizando la posicion inicial
        //substring desde la posicion 9
        System.out.println( str.substring(9) );
        //substring desde la posicion 15
        System.out.println( str.substring(15) );
    }
}
