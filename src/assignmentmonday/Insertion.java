package assignmentmonday;
import java.util.*;
public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		System.out.println(array);
		System.out.println("original :" +array);
		Scanner take =new Scanner(System.in);
		System.out.println("enter to add");
		array.add(0,take.next());
		
		System.out.println(array);
	}

}





