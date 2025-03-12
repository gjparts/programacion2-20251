package com.mycompany._string07;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*Metodo replace
        Devuelve un String al cual se le ha reemplazado todas las coincidencias
        de un String X por un String Y
        -> Este metodo no ignora mayusculas/minusculas*/
        String str = "Verde es la Manzana, la manzana es verde. Que verde es la manzana!";
        System.out.println("str: "+str);
        //reemplazar verde por roja sin alterar al string original
        System.out.println( str.replace("verde", "roja") );
        System.out.println("str: "+str);
        //alterar el String original
        str = str.replace("verde", "roja");
        System.out.println("str: "+str);
        
        //es posible desencadenar varios replace en una sola instruccion
        String str2 = "La naranja es una gran fruta, el juego de naranja es mejor que el de noni.";
        //reemplazar naranja por sandia y noni por anona afectando al string original
        str2 = str2.replace("naranja", "sandia").replace("noni", "anona");
        System.out.println("str2: "+str2);
        
        //reemplazar en un String ignorando mayusculas/minusculas
        //se logra utilizando expresiones reguales (regex) y el metodo replaceAll
        String str3 = "Rojo ROJO ROjo RoJo VERDE verde Verde VeRDE AZUL Azul azul AZul";
        //reemplazar verde por amarillo ignorando mayusculas/minusculas en cada reemplazo
        //alterando a la cadena original
        str3 = str3.replaceAll("(?i)verde", "amarillo");
        System.out.println("str3: "+str3);
        
        /*preguntar una cadena de texto al usuario y dentro de ella van a reemplazar
        todos los espacios en blanco por guiones bajos, tambien van a reemplazar
        todas las letras a por 4, las letras e por 3, las letras i por 1
        ignorando mayusculas y minusculas en cada reemplazo y alterando al String original*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite un String: "); 
        String x = s.nextLine();
        x=x.replace(" ", "_").replaceAll("(?i)a", "4").replaceAll("(?i)e", "3").replaceAll("(?i)i", "1");
        System.out.println(x);
    }
}
