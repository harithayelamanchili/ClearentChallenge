package practice1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCreditCard
{
	@Test
	public void testVisa() 
	{
		assertEquals(10.0, Cards.visa(100),0.1);	
	}
	@Test
	public void testMC()
	{
		assertEquals(5.0, Cards.MC(100),0.1);
	}
	@Test
	public void testDiscover()
	{
		assertEquals(1.0, Cards.Discover(100),0.1);
	}
	@Test
	public void testWallet()
	{
		double v[] = {100.0,100.0,100.0};
		double MC[] = {100,100};
		double d[] = {100,100,100}; 
		assertEquals(43.0,Wallet.wallet(v,MC,d),0.1);
	}
	@Test 
	public void testPersons()
	{
		double v[] = {100.0, 100.0, 100.0};
		double MC[] = {100,100};
		double d[] = {100,100,100}; 
		double ans = 0, total = 0;
		int num = 1; // no. of wallets	
			ans = ans + Wallet.wallet(v, MC, d);
			total = total + Person.person(num,v,MC,d);
		assertEquals(Person.person(num,v,MC,d),ans,0.1);
	}
	@Test
	//Test Case 1
	public void testPerson1()
	{
		double v[] = {100.0};
		double MC[] = {100.0};
		double d[] = {100.0};
		double ans = 0;
		ans=Wallet.wallet(v, MC, d);
		assertEquals(10.0, Cards.visa(100),0.1); 	// Test per card.
		assertEquals(5.0, Cards.MC(100),0.1);		// Test per card.
		assertEquals(1.0, Cards.Discover(100),0.1); // Test per card.
		assertEquals((Cards.visa(100)+Cards.MC(100)+Cards.Discover(100)),ans,0.1); //Test per Wallet which is equal to test for Interest per person
	}
	@Test
	//Test Case 2
	public void testPerson2()
	{
		//1st Wallet contains Visa and Discover Cards
		double v1[] = {100.0};
		double MC1[] = {0};
		double d1[] = {100.0};
		double ans1 = 0;
		ans1=Wallet.wallet(v1, MC1, d1);
		
		assertEquals((Cards.visa(v1[0])+Cards.MC(MC1[0])+Cards.Discover(d1[0])),ans1,0.1); //Test for Interest for Wallet 1
		
		//2nd Wallet contains a MC Card
		double v2[] = {0.0};
		double MC2[] = {100.0};
		double d2[] = {0.0};
		double ans2 = 0;
		ans2=Wallet.wallet(v2, MC2, d2);
		assertEquals((Cards.visa(v2[0])+Cards.MC(MC2[0])+Cards.Discover(d2[0])),ans2,0.1); //Test for Interest for Wallet 2
		
		assertEquals((Person.person(1,v1,MC1,d1)+Person.person(1,v2,MC2,d2)),(ans1+ans2),0.1);
	}
	@Test
	//Test Case3
	public void testPerson3()
	{
		//There are 2 people
		//1st Person has 1 Wallet with 1 Visa, 1 MC, 1 Discover Cards
		double v1[] = {100.0};
		double MC1[] = {100.0};
		double d1[] = {100.0};
		double ans1 = 0;
		ans1=Wallet.wallet(v1, MC1, d1);
		
		assertEquals((Cards.visa(v1[0])+Cards.MC(MC1[0])+Cards.Discover(d1[0])),ans1,0.1); //Test for Interest for Wallet 1
		assertEquals(Person.person(1,v1,MC1,d1),ans1,0.1); // Test for Interest for 1st Person
		
		//2nd Person has 1 Wallet with 1 Visa and 1 MC cards
		double v2[] = {100.0};
		double MC2[] = {100.0};
		double d2[] = {0.0};
		double ans2 = 0;
		ans2=Wallet.wallet(v2, MC2, d2);
		assertEquals((Cards.visa(v2[0])+Cards.MC(MC2[0])+Cards.Discover(d2[0])),ans2,0.1); //Test for Interest for Wallet 2
		
		assertEquals((Person.person(2,v2,MC2,d2)),ans2,0.1); // Test for Interest for 2nd Person
	}
	
}
