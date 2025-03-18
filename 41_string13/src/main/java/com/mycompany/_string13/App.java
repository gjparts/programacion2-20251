package com.mycompany._string13;
public class App {
    public static void main(String[] args) {
        //Conversiones
        //convertir de String a int
        String str1 = "800";
        int entero1 = Integer.parseInt(str1);
        System.out.println("str1: "+str1);
        System.out.println("entero1: "+entero1);
        
        //convertir de String a float
        String str2 = "5.26564";
        float f1 = Float.parseFloat(str2);
        System.out.println("str2: "+str2);
        System.out.println("f1: "+f1);
        
        //convertir de String a double
        String str3 = "1.1321354687789";
        double d1 = Double.parseDouble(str3);
        System.out.println("str3: "+str3);
        System.out.println("d1: "+d1);
        
        //convertir de String a long
        String str4 = "1234123412345";
        long l1 = Long.parseLong(str4);
        System.out.println("str4: "+str4);
        System.out.println("l1: "+l1);
        
        //convertir desde cualquier numero primitivo hacia String
        int entero2 = 504;
        float f2 = 8.54345345f;
        double d2 = 1424.4324324234;
        long l2 = 1111222288888L;
        String str5 = String.valueOf(entero2);
        String str6 = String.valueOf(f2);
        String str7 = String.valueOf(d2);
        String str8 = String.valueOf(l2);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
    }
}

