public class NoArgConstructor {

    String location;
    public NoArgConstructor() {
        location =  "India";

    }
    

    public static void main(String[] args) {
        NoArgConstructor obj = new NoArgConstructor();
        System.out.println("Location is " + obj.location);
    }
}

//you can see that I was able to access the value that was defined in the constructor
//Earlier, I assigned location to be a datatype of string, so I dont have to mention it later in the constructor


