package assignmentmonday;
import java.util.*;
public class Iterate1 {

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
		
		System.out.println("Original list: "+array);
		Scanner iterate = new Scanner(System.in);
		System.out.println("Enter index from which iteration should start");
		int ind = iterate.nextInt();
		ListIterator i = array.listIterator(ind);
		while(i.hasNext()) {
		System.out.println(i.next());
			}
		}
	}








	
	
	

	