package carproject;

public abstract class Car {
	
	String make;
	String model;
	int year;
	double price;
	
	
	
	public Car(String model, int year, double price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car() {
		
	}
	abstract String  carMake();
	abstract String carModel();
	abstract int carYear();
	abstract double carPrice();

}
