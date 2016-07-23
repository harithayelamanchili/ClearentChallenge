package practice1;

public class Wallet {
	public static double wallet( double v[], double mc[], double d[]){
		double Vinterest = 0;
		double MCinterest = 0;
		double Dinterest = 0;
		double interest = 0; 
		for(int i = 0; i < v.length; i++){
			Vinterest = Vinterest+Cards.visa(v[i]);
		}
		for(int i = 0; i < mc.length; i++){
			MCinterest = MCinterest+Cards.MC(mc[i]);
		}
		for(int i = 0; i < d.length; i++){
			Dinterest = Dinterest+Cards.Discover(d[i]);
		}
		interest = Vinterest + MCinterest + Dinterest; 
		return interest;
	} 
}

