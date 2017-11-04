package arrayListLabNumber8;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListLabNumber8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i;
		float batterCount = 0;
		float batterSum = 0;
		float batterAverage = 0;
		float batterSlugging = 0;
		int batterResult = 0;
		String loopContinue = "yes";
		
		//array lists
		
		ArrayList<Integer> batterArrayList = new ArrayList<Integer>();
		
		System.out.println("Welcome to Batting Average Calculator!");
		
		while (loopContinue.equalsIgnoreCase("yes")) {

			System.out.println("How many times has the batter been at bat?");
		
			batterArrayList.add(input.nextInt());
			System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			
			
			
			
			
			
			//System.out.println("Another Batter? yes or no");
			//loopContinue = input.nextLine();

		}
		System.out.println("Goodbye");
		input.close();
		

	}

}
