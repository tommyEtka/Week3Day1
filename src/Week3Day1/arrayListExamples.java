package Week3Day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class arrayListExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scan1 = new Scanner(System.in);
		

		ArrayList <Integer> ls = new ArrayList<Integer>();
		//LinkedList <Integer> ls1 = new LinkedList<Integer> ();		

		ls.add(5);
		ls.add(6);
		
		for(int i = 0; i<ls.size(); i++){
			
			//prints each element
			System.out.println(ls.get(i));
		}
		//prints the length
		System.out.println(ls.size());
		
	}

}
