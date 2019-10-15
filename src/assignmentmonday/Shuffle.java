package assignmentmonday;
import java.util.*;
public class Shuffle {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();

		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		array.add("Sneha");
		array.add("Nishkarsh");
		array.add("Raghu");
		

		System.out.println("Original list: "+array);
		Collections.shuffle(array);
		System.out.println("Sorted List: "+array );
	}

}