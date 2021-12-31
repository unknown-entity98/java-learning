
public class CallingPerson {

    public static void main(String[] args) {
        person obj = new person();
        String name = obj.GetName();
        System.out.println(name);
        //System.out.println(obj.email); --> error
        obj.setName("Cat Doe");
        name = obj.GetName();
        System.out.println(name);
        System.out.println(obj.age);
    }
    
}