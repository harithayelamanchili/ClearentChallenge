package practice1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//Visa 10%
		//MC 5%
		//Discover 1%
		
		double total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of people ");
		int people = sc.nextInt(); // No. of wallets a person has

		for(int k = 0; k < people; k++)
		{
			total = 0;

			total = PersonsInput.person(k);
		
			System.out.println("The total Interest for the Person  = " + total);
			System.out.println("-----------------");
		}
	}

	}



