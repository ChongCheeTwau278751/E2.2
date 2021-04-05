package Exe2;

public class Dog {

	String breed;
	String color;
	String size;
	String type;
	
	void printProperties(String b, String c, String s, String t) {
		System.out.println(
				"\nBreed 	   :" + b
			+	"\nColour 	   :" + c
			+	"\nSize 	   :" + s
			+	"\nType 	   :" + t
				);
	}
	
	void calPrice(int p, int q) {
		int t = p*q;
		System.out.println("The price of this dog is around RM" + t);
	}
	
	void calCost(int r) {
		int v = r*10;
		System.out.println("Cost of feeding for a year(one dog): RM" + v);
	}
	
	void calEat(double z) {
		double y = (1/z*10)*1000;
		double a = Math.round(y);
		System.out.println("Around " + a + "g of food is needed a day for this kind of dog.");
	}
	
	void idealWeight(int d, int e) {
		int f = (d*100)/(100+(e-5)*10);
		System.out.println("The ideal weight of the dog with " + d + " pounds of starting weight and "+ e + " BCS is around " + f + " pounds.");
	}
}