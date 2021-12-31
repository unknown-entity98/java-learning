public class ClassExampleFromAnotherFile {

    public static void main(String[] args) {
        ClassExample led = new ClassExample(); 
        ClassExample bulb = new ClassExample();

        led.turnOn();
        bulb.turnOff();
        
    }
    
}

//Here, I am referencing the Class from the ClassExample file, and using that method
//since the class was public, we can access it.
