public class ReturnMethod {
    public static int max (int x , int y)
{
        if (x > y)
            return x;
        
        else 
            return y;
        

    }
public static void main(String[] args) {
        System.out.println(max(5,10));
}

}




//synatax of a method
//modifier static returnType methodName(parameters)
//modifier – defines the access type of the method. That is, from where the method can be accessed in the application. ​In java there are four types of modifiers – public, private, protected, default​
//static – function can be accessed without creating objects
//returnType - It specifies what type of value a method returns For example if a method has  an int return type ​then it returns an integer value​ -  If the method does not return a value, its return type is void​
//methodName - It is an identifier that is used to refer to the particular method in a program.
//parameters – comma separated list of input. If there are no parameters then its denoted as ‘()’​
