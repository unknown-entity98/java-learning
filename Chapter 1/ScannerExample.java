import java.util.Scanner;


public class ScannerExample {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = reader.nextInt();

        if (num % 2 == 0)

            System.out.println(num + " is even");

        else

            System.out.println(num + " is odd");
    }
}

//What scanner does is read ur input and do something with it, what ever you ask it to do