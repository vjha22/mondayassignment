package assignmentmonday;
import java.util.*;
public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		System.out.println(array);
		System.out.println("original :" +array);
		Scanner retrive =new Scanner(System.in);
		System.out.println("enter to retrive");
		int ind = retrive.nextInt();
		
		
		System.out.println("the element is "+array.get(ind));
	}

}
//




