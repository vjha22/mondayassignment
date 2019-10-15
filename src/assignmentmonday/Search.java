package assignmentmonday;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		Scanner search = new Scanner(System.in);
		System.out.println("Enter  name to search.");
		if (array.contains(search.next())) {
			  System.out.println(" element exist");
			  } else {
			  System.out.println(" element ille ");
			  }
	}
}

//


// Creae a list and add some colors to the list

// Search the value Red
