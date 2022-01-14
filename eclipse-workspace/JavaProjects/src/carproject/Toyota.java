package carproject;


public class Toyota extends Car {
	
	String make ="Toyota";
	String model="Camry";
	int year=2020;
	double price=5000;

	public Toyota() {
		
	}

	public Toyota(String model, int year, double price) {
		super(model,year,price);
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	String carMake() {
		
		return "The car make is : " +this.make;
	}

	@Override
	String carModel() {
		
		return "The car model is : " +this.model;
	}

	@Override
	int carYear() {
		
		System.out.print("year: ");
		return this.year;
	}

	@Override
	double carPrice() {
		
		System.out.print("CAr Price: ");
		return this.price;
	}

}
