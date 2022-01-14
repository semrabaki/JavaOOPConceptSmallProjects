package carproject;

public class CarRunner {

	public static void main(String[] args) {
		
    System.out.println("====================Car 1===========================");
   
    Car car1=new Toyota();
    
    System.out.println(car1.make);//null
    System.out.println(car1.carMake());//The car make is : Toyota
    System.out.println(car1.carModel());//The car model is : Camry
    System.out.println(car1.carYear());//  year: 2020
    System.out.println(car1.carPrice());//CAr Price: 5000.0
    
    
    System.out.println("====================Car 2===========================");
    Car car2= new Toyota("Auris", 2020, 1000);
    System.out.println(car2.model);//null
    System.out.println(car2.carMake());//The car make is : Toyota
    System.out.println(car2.carModel());//The car model is : Camry
    System.out.println(car2.carYear());//  year: 2020
    System.out.println(car2.carPrice());//CAr Price: 5000.0
    
    System.out.println("====================Car 3===========================");
    
    Car car3= new Honda();
    System.out.println(car3.model);//null
    System.out.println(car3.model);//
    System.out.println(car3.carMake());//The car make is : Toyota
    System.out.println(car3.carModel());//The car model is : Camry
    System.out.println(car3.carYear());//  year: 2020
    System.out.println(car3.carPrice());//CAr Price: 5000.0
    
   
    
    
   

	}

}
