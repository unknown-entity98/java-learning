//Belib me, this is best calc


public class BestCalcStatic {

    static void add (float a , float b){
        System.out.println("sum is:  " + (a + b));
    }

    static void diff (float a , float b){
        System.out.println("sum is:  " + (a - b));
    }

    static void mul (float a , float b){
        System.out.println("sum is:  " + (a * b));
    }

    static void div (float a , float b){
        System.out.println("sum is:  " + (a / b));
    }

    public static void main(String[] args) {
        float c = 5.0f;
        float d = 2.5f;
        add(c,d);
        diff(c,d);
        mul(c,d);
        div(c,d);

    }
}


/*
If you notice, since we made it as static, we did not need to create a new object like last time

*/