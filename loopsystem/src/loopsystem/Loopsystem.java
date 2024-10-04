package loopsystem;

import java.util.Scanner;

public class Loopsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		String data;
		
		// This loop will run until the user enters a five lettered word
		do {
			System.out.println("Enter data(five-lettered word to quit):");
			data = scanner.nextLine();
			
			if(data.length() < 5 ) {
				System.out.println("You entered:" +data);
			} else {
				System.out.println("Exiting.........");
			}
			}while(data.length() < 5);
		
            scanner.close();		
	}
		
		
		
		
	}


