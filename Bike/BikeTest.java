package Bike;

public class BikeTest {
	public static void main(String[] args) {
		//�إ߹��骫��
		Bike mybike= new Bike();
		
		System.out.println(Bike.count);
		System.out.println(Bike.getCount());
		
		System.out.println(mybike.Speed);
		
		mybike.Speed=10;
		System.out.println(mybike.Speed);
		
		mybike.addSpeed();
		System.out.println(mybike.Speed);
		
		mybike.reduceSpeed();
		System.out.println(mybike.Speed);
	}
}
