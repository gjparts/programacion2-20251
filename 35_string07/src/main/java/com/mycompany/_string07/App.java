package com.mycompany._string07;
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
    }
}
