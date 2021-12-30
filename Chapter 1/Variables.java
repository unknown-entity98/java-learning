/*

Datatypes of variables are to be defined 
String - Text
int - Integer
float - Decimal values like 12.00 2.4556
char - single letter/character
boolean - true or false only
*/

//(Data type)  (variable name) = value​   --> syntax

//All the variables must be declared before it is used. This makes java a statically typed language.​

public class Variables {
    public static void main(String[] args) {
        int integer = 5;
        String str = "Belib me, this is string";
        Float flt = 12.566f;
        char character = 'B';
        Boolean bool = true;
        byte by = 10;
        short sh = 500;
        long lo = 50000000000000l;
        double doy = 1.167d;

        System.out.println(integer);
        System.out.println(str);
        System.out.println(flt);
        System.out.println(character);
        System.out.println(bool);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(lo);
        System.out.println(doy);

        //variable.length prints length
        System.out.println(str.length());

        //Case changing of printed stuff
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
           }    
    
}
