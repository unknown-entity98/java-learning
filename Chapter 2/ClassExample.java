public class ClassExample {

    // stores the value for light
    // true if light is on
    // false if light is off

    boolean isOn;  // Create a variable, and assign its datatype. 
    // method to turn on the light

    void turnOn() {  //this is a method. The void indicates that it dosent return any value
        isOn = true;  //Modify the created variable
        int i = 5; //you can also create new variables
        System.out.println("Light on? " + isOn + " " + i); 
    }

    void turnOff() { //creating a new method
        isOn = false;
        int i = 3;
        System.out.println("Light on? " + isOn + " " + i); 


    }

    public static void main(String[] args) {

        // create an object of This class
        ClassExample led = new ClassExample(); 
        ClassExample bulb = new ClassExample();

        // access method using object
        led.turnOn(); 
        bulb.turnOff();
    }
}