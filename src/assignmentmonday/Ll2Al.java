package assignmentmonday;
import java.util.*;
public class Ll2Al {

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
		List<String> al = new ArrayList<String>(ll);
		System.out.println("The Linked List is: "+ll);
		System.out.println("The Array List is: "+al);
	}
}




