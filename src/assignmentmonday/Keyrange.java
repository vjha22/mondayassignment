package assignmentmonday;

import java.util.Scanner;
import java.util.TreeMap;

public class Keyrange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tr= new TreeMap<>();
		tr.put(1,"Vivek");
		tr.put(2,"Vansh");
		tr.put(3,"Priyanshu");
		tr.put(4,"Prashant");
		tr.put(5,"Dipayan");
		tr.put(6,"Raghu");
		tr.put(7,"Harsh");
		System.out.println("The tree map 1: "+tr);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter lower key limit");
		int lk = s.nextInt();
		System.out.println("Enter upper key limit");
		int uk = s.nextInt();
		System.out.println("The element with keys ranging between "+lk+" and "+uk+" are "+tr.subMap(lk, uk));
	}
}
