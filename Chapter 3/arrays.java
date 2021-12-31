public class arrays {


  public static void main(String[] args) {
      
      
          //declare the array to store many String values
      
          //insert values to arrays
      
          String[] cars = {
            "Volvo",
            "BMW",
            "Ford",
            "Mazda"
          };
      
          
      
          //length of the array
      
          System.out.println(cars.length);
          
      
          //display each element in the array
      
          //index starts at 0
          System.out.println(cars[0]);
      
          System.out.println(cars[1]);
      
          System.out.println(cars[2]);
      
          System.out.println(cars[3]);
      
          
      
          //index out of bounds for length 4 will be displayed
      
          //System.out.println(cars[4]);
      
          
          //prints empty line in the console
      
          System.out.println();
      
          
      
          // display elements of the array using 'for' loop
      
          System.out.println("--for loop--");
      
          for (int i = 0; i < cars.length; i++)
      
            System.out.println(cars[i]);
      
          
      
          //prints empty line in the console
      
          System.out.println();
      
          
      
          //display elements of the array using 'while' loop
      
          System.out.println("--while loop--");
      
          int j = 0;
          while (j < cars.length) {
            
            System.out.println(cars[j]);
      
            j++;
      
          }
      
        }
      }


//Its the same logic for all other data types too
