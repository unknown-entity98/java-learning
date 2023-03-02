/* this code will demonstrate the usage of the LinkedList utility in java
 * 
 * LinkedList is a data structure that stores items in nodes/containers. The list has a link to the first container and each container has a link to the next container in the list.
 * When adding a new element, we store the data in a container and link the container to a container in the list.
 */
import java.util.LinkedList;

public class LinkdList {
    public static void main(String[]a){
        //creating a LinkedList to store shows
        LinkedList<String> my_kdrama = new LinkedList<String>();
        my_kdrama.add("Dokkaebi (2016)");
        my_kdrama.add("One Dollar Lawyer");
        my_kdrama.add("Descendants of the Sun");
        my_kdrama.add("Strong Woman Do Bong Soon");

        System.out.println("Right now, the list has: "+my_kdrama);

        my_kdrama.addFirst("The Heirs");;
        System.out.println("We can add an element in the front: "+my_kdrama);

        my_kdrama.addLast("Its okay to not be okay");
        System.out.println("We can add an element in the last: "+my_kdrama);

        my_kdrama.removeFirst();//removes the first element
        my_kdrama.removeLast();//removes the last element
        System.out.println("After removing first and last element using removeFist() and removeLast(): "+my_kdrama);

        System.out.println("If I want the first show on my drama list, use getFirst(): "+my_kdrama.getFirst());
        System.out.println("If I want the last show on my drama list, use getFirst(): "+my_kdrama.getLast());

        System.out.println("to check if I have Goblin on my list, use contains(): "+my_kdrama.contains("Dokkaebi (2016)"));

        my_kdrama.clear();
        System.out.println("My current list after clearing the dramas I have watched: "+my_kdrama);
    }
}
