//Constructor name = class name
//There is no return type


public class ConstructorExample {

    //Constructor
    public ConstructorExample() {
        System.out.println("Who called the constructor!!!!!!!!!!!");
    }


public int add(int a , int b) {

    int c  = a + b;
    return c;
}

public static void main(String[] args) {
    ConstructorExample Obj = new ConstructorExample();
    int a = 12;
    int b = 13;
    int sum = 0;

    sum = Obj.add(a,b);

    System.out.println("Sum: "+sum);

}

}
