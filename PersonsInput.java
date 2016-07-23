package practice1;

import java.util.Scanner;
public class PersonsInput 
{
	public  static double  person(int k)
	{
		double ans = 0;
		double total = 0;
		Scanner sc = new Scanner(System.in);

		int n, m, p; // No. of Visa, MC and Discover cards.

		total = 0;

		System.out.println("Enter the no. of wallets the person "+(k+1)+" has ");

		int numOfWallet = sc.nextInt(); // No. of wallets a person has

		double Wallets[] = new double[numOfWallet];
		for(int i = 0; i < numOfWallet; i++)
		{
			System.out.println("In Wallet "+(i+1));
			System.out.println("The no. of Visa Cards the wallet has " );
			n = sc.nextInt();
			System.out.println("The no. of MC Cards the wallet has " );
			m = sc.nextInt();
			System.out.println("The no. of Discover Cards the wallet has " );
			p = sc.nextInt();
			double visa[] = new double[n];
			double MC[] = new double[m];
			double Discover[] = new double[p];

			for(int j = 0; j < n; j++ )
			{

				System.out.println("The Amount in  Visa Card "+(j+1)+" of wallet "+(i+1));
				visa[j] = sc.nextDouble();

			}
			for(int j = 0; j < m; j++ )
			{
				System.out.println("The Amount in MC Card "+(j+1)+" of wallet "+(i+1));
				MC[j] = sc.nextDouble();

			}
			for(int j = 0; j < p; j++ )
			{
				System.out.println("The Amount in Discover Card "+(j+1)+" of wallet "+(i+1));
				Discover[j] = sc.nextDouble();	
			}
			
			ans = Person.person(i,visa,MC,Discover);
			Wallets[i] = ans;
			
			total = total + ans;


			System.out.println("The total Interest for the wallet " + (i+1)+" = " +ans );

		}

		return total;
	}
}
