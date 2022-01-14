package carproject;

public class Honda extends Car {
	
	String make="Honda";
	String model="CRV";
	int year=2020;
	double price=9000;

	
	
	
	public Honda() {
		
	}
	

	public Honda(String model, int year, double price) {
		super(model, year, price);
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
