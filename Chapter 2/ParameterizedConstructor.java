//I am not making this a public class, for sake of variety 
//here, while creating the object, you input the variable

class ParameterizedConstructor {

    String location;
    ParameterizedConstructor(String loc) {

            location = loc;
            System.out.println("Inside the constructor " + location);

    }
    
    public static void main(String[] args) {
    
        ParameterizedConstructor obj = new ParameterizedConstructor("LA");
        System.out.println("Inside the Main, object call " + obj.location);
        

    }
}
