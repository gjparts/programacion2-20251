package com.mycompany._string04;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Comprar dos String en JAVA
        Los String en JAVA son objetos por lo tanto
        para comparar sus contenidos no se debe usar ==
        ya que este ultimo compararia sus direccion de memoria
        y no sus contenidos.
        Para comparar los contenidos de dos objetos en JAVA
        se utiliza el metodo equals.*/
        //excepto en este caso:
        String a = "Manzana";
        String b = "Manzana";
        if( a == b )
            System.out.println("a y b son iguales");
        else
            System.out.println("a y b no son iguales");
        System.out.println("direccion de memoria para a: "+System.identityHashCode(a));
        System.out.println("direccion de memoria para b: "+System.identityHashCode(b));
        //cuando las variables String se les asigna un valor fijo (constante)
        //y ambas tienen el mismo valor, entonces JAVA al compilar en la etapa
        //de optimizar memoria les asigna la misma direccion y por eso aqui si las puede
        //comparar usando ==
        //Pero, que pasaria si los valores de a y b no son fijos:
        Scanner s = new Scanner(System.in);
        System.out.print("Digite el valor de a: ");
        a = s.nextLine();
        System.out.print("Digite el valor de b: ");
        b = s.nextLine();
        //comparar usando == (incorrecto en JAVA)
        if( a == b )
            System.out.println("a y b son iguales usando ==");
        else
            System.out.println("a y b no son iguales usando ==");
        System.out.println("direccion de memoria para a: "+System.identityHashCode(a));
        System.out.println("direccion de memoria para b: "+System.identityHashCode(b));
        
        //forma correcta:
        if( a.equals(b) == true )
            System.out.println("a y b son iguales usando equals");
        else
            System.out.println("a y b no son iguales usando equals");
        //equals no ignora mayusculas y minusculas
        
        //comparar dos String ignorando mayusculas/minusculas
        //forma 1:
        if( a.equalsIgnoreCase(b) == true )
            System.out.println("a y b son iguales usando equalsIgnoreCase");
        else
            System.out.println("a y b no son iguales usando equalsIgnoreCase");
        //forma 2:
        if( a.toUpperCase().equals(b.toUpperCase()) == true )
            System.out.println("a y b son iguales usando equals y toUpperCase");
        else
            System.out.println("a y b no son iguales usando equals y toUpperCase");
        
        /*Haga un programa que pregunte 3 String al usuario, luego imprimiran
        un mensaje indicando si los 3 son iguales, o si no son iguales. Debera
        ignorar mayusculas/minusculas y tambien ignore los espacios de relleno.*/
        String x,y,z;
        System.out.print("Digite string para x: ");
        x = s.nextLine();
        System.out.print("Digite string para y: ");
        y = s.nextLine();
        System.out.print("Digite string para z: ");
        z = s.nextLine();
        if( x.trim().equalsIgnoreCase(y.trim()) == true && x.trim().equalsIgnoreCase(z.trim()) == true )
            System.out.println("Los tres String son iguales.");
        else
            System.out.println("Los tres String no son iguales.");
    }
}
