package com.company;

public class vp_04StringMethods {
    public static void main(String[] args){
        String name = "Vinod";
        //String Methods

        //String length
        int value = name.length();
        System.out.println(value);

        //Convert string to uppercase
        String ucase = name.toUpperCase();
        System.out.println(ucase);

        //Convert string to Lowercase
        String lcase = name.toLowerCase();
        System.out.println(lcase);

        //Trim the extra space
        String unTrim = "   Vinod   ";
        String Trim = unTrim.trim();
        System.out.println(Trim);

        //Substring with beginning index
        String substr = name.substring(3);
        System.out.println(substr);

        //Substring with beginning index
        String substring = name.substring(1,4);
        System.out.println(substring);

        //replace
        System.out.println(name.replace("od", "i"));

        //boolean start with words
        System.out.println(name.startsWith("Vi"));
        System.out.println(name.endsWith("od"));

        //character at index
        System.out.println(name.charAt(2));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry",4));

        //equals
        System.out.println(name.equals("Vinod"));
        System.out.println(name.equalsIgnoreCase("ViNoD"));
    }
}