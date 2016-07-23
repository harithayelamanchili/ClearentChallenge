package practice1;

public class Person 
{
	
	public static double person(int noOfWallet,double visa[], double MC[], double Discover[])
	{
		double ans;
		
	ans = Wallet.wallet(visa,MC,Discover);

	return ans;
	}
}
