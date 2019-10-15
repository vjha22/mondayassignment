package assignmentmonday;
import java.util.*;
public class RetriveL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("Vivek");
		array.add("Vansh");
		array.add("Priyanshu");
		array.add("Prashant");
		array.add("Raghu");
		array.add("Harsh");
		array.add("dipayan");

		Collections.shuffle(array);
		System.out.println("shuffled list:"+array);
		int index = array.size();
		String el = array.get(index-1);
		System.out.printf("The element at last index is %s ",el);
	}
}

