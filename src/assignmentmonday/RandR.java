package assignmentmonday;
import java.util.*;
public class RandR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ll = new LinkedList<String>();

ll.add("Vivek");
ll.add("Vansh");
ll.add("Priyanshu");
ll.add("Prashant");
ll.add("Raghu");
ll.add("Harsh");
ll.add("dipayan");
		Collections.shuffle(ll);
		System.out.println("The Linked List before removing element: "+ll);
		System.out.println("The element "+ll.get(0)+" was removed from the first place" );
		ll.remove(0);
		System.out.println("The Linked List after removing element: "+ll);
	}
}