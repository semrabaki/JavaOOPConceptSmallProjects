package manavprojesi;

import java.util.*;

/*
 /*
 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
 *
 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
 *
 * */


public class Manav {
	
	static List<String> listOfProduct = new ArrayList<>();
	static List<Double> priceOfProduct = new ArrayList<>();
	static int total=0;
	

	public static void main(String[] args) {
		
		listOfProduct.add("domates 1");
		listOfProduct.add("biber 2");
		listOfProduct.add("muz 3");
		listOfProduct.add("elma 4");
		listOfProduct.add("patlican 5");
		
		priceOfProduct.add(3.6);
		priceOfProduct.add(5.6);
		priceOfProduct.add(6.6);
		priceOfProduct.add(1.6);
		priceOfProduct.add(3.0);
		System.out.println(listOfProduct);
		
		customerChoise();

	}
	public static void customerChoise()
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Choose your product");
		int choise=scan.nextInt();
		
		System.out.println("How many kilograms do you want");
		double kilograms= scan.nextDouble();
		
		double productAmount=priceOfProduct.get(choise-1);
		
		double payment= kilograms*productAmount;
		total+=payment;
		System.out.println(total);
		
		System.out.println("If you want to continue 1, or 2");
		int decision=scan.hashCode();
		
		if(decision==1)
		{
			customerChoise();
		}
		else
		{
			till();
		}
		
	}
	private static void till() {
		System.out.println(total);
		
	}

}
