package assignmentmonday;
import java.util.*;


public class Iterate2 {

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
		Scanner v = new Scanner(System.in);
		ListIterator i = array.listIterator(array.size());
		while(i.hasPrevious()) {
		System.out.println(i.previous());
			}
		}
	}





	
	