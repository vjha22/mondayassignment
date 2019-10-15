package assignmentmonday;
import java.util.*;
public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> array = new LinkedList<String>();
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		array.add("Raghu");
		array.add("Harsh");
		array.add("dipayan");
		
		System.out.println("Original: "+array);
		Scanner append = new Scanner(System.in);
		System.out.println("Enter name to be added at the last");
		array.add(array.size(),append.next());
		System.out.println("Updated List: "+array );
		}
	}
	