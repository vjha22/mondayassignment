package assignmentmonday;
import java.util.*;

public class Searchtree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tr= new TreeMap<>();
		tr.put(1,"Vivek");
		tr.put(2,"Vansh");
		tr.put(3,"Priyanshu");
		tr.put(4,"Prashant");
		tr.put(5,"Dipayan");
		tr.put(6,"Raghu");
		tr.put(7,"Harsh");
		System.out.println("The tree map 1: "+tr);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Key to search");
		int k = s.nextInt();
		if(tr.containsKey(k)) {
			System.out.println("The element with key "+k+" is "+tr.get(k));
		}
		else
			System.out.println("Key not found");
	}
}