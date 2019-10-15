package assignmentmonday;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> array1 = new ArrayList<String>();
		List<String> array2 = new ArrayList<String>();
		List<String> array3 = new ArrayList<String>();
		array1.add("Vivek");
		array1.add("Vansh");
		array1.add("Priyanshu");
		array1.add("Prashant");
		array1.add("Raghu");
		array1.add("Harsh");
		array1.add("dipayan");
		
		
		array2.add("Vivek");
		array2.add("Ram");
		array2.add("Vansh");
		array2.add("Red");
		
		System.out.println("First list: "+array1);
		System.out.println("Second List: "+array2 );
		
		for(String comp: array1) {
			if(array2.contains(comp))
				array3.add(comp);
		}
		System.out.println("Common Elements are: "+array3);
	}
}

		
		