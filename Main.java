package Exe2;

import java.util.Scanner;

import PhoneProfile.Phone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog alaskan = new Dog();
		Dog shepherd = new Dog();
		Dog affein = new Dog();
		Dog terrier = new Dog();
		
		alaskan.printProperties("Alaskan Malamute","grey","medium","working dogs");
		alaskan.calPrice(3300, 1);
		alaskan.calCost(3300);
		alaskan.calEat(37.00);
		alaskan.idealWeight(150, 9);
		
		shepherd.printProperties("Anatolian Shepherd Dog","White","Big", "Pastoral dogs");
		shepherd.calPrice(3800, 1);
		shepherd.calCost(3800);
		shepherd.calEat(55.00);
		shepherd.idealWeight(120, 7);
		
		affein.printProperties("Affenpinscher","Black","Small", "Toy dogs");
		affein.calPrice(3000, 1);
		affein.calCost(3000);
		affein.calEat(16.00);
		affein.idealWeight(40, 8);
		
		terrier.printProperties("Boston Terrier","Black and White","Small", "Utility dogs");
		terrier.calPrice(2800, 1);
		terrier.calCost(2800);
		terrier.calEat(11.00);
		terrier.idealWeight(45, 8);
	}

}
