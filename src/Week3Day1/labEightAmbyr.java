package Week3Day1;


//import java.util.Arrays;
import java.util.Scanner;
public class labEightAmbyr {
	
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        float sum = 0; // used to calculate the sum of the results in the array
	        float count = 0;
	        float average = 0; // variable used to calculate batting average
	        float slugging = 0; // variable used to calculate slugging percentage
	        int result = 0; // used to take result at each bat also used to push
	        String cont = "y"; // count for times batter hit more than 0
	        while (cont.equalsIgnoreCase("y")) {
	         
	            System.out.println("How many times has the batter been at bat?");
	            int[] atBat = new int[scan.nextInt()]; 
	            System.out.println("0 = out, 1 = single, 3 = triple 4 = home run");
	           
	            
	            for (int i = 0; i < atBat.length; i++) { 
	                                                        
	                System.out.println("Result for at-bat " + (i + 1));
	                result = scan.nextInt();
	                scan.nextLine();
	                if (result<=4&&result>=0) {
	                atBat[i] = result;
	                }else{
	                    System.out.println("Invalid input");
	                i--;
	                }
	                if (result > 0&&result<=4)
	                    count++;

	                 
	                
	                }
	            for (int a : atBat)             
	                sum += a;
	            average = count / atBat.length; 
	            slugging = sum / atBat.length;
	            System.out.println("The batter was at-bat " + atBat.length
	                    + " times. Of those times a score greater than zero was obtained " + count + " times. The batter batting average is " + average + " and the slugging percentage is " + slugging + "\n");
	            
	            System.out.println("Another Batter? y or n");
	            cont = scan.nextLine();
	        }
	        System.out.println("Goodbye");
	      
	    scan.close();
	    }
	}

