public class BasicMeths {
    public static void main(String[] args) {
        int i  = 5;
        System.out.println(i + 2);
        System.out.println(i - 2);
        System.out.println(i * 2);
        System.out.println(i / 2); //it will print only the integer part becasue the data type is int
        System.out.println( (float) i / 2);  //type casting was done here, just to show
        System.out.println(i += 2);
        System.out.println(i);
        System.out.println(i -= 1);
        System.out.println(i);

        //Comparision Operators
        int a = 10;
        int b  = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b); // checks if they both are equal
        System.out.println(a!=b); // check if they are not equal


        //Logical Operators
        System.out.println(a > 0 && a < 6); //logical and
        System.out.println(a > 0 || a < 6); //logical or
    }
    
}

