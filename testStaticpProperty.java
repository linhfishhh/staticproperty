package staticproperty;

public class testStaticpProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car("mazda","skytiv 3");
		System.out.println(car.numberOfCars);
		car c2=new car("Mercedes", "S650");
		System.out.println(car.numberOfCars);
	}

}
