package Bike;

public class Bike {
	//�ݩʥH�ܼƨӭt�d
	double Speed;
	
	//���O����  static variable
	static int count;
	
	//�ŧi�غc�l
	Bike(){
		Speed =7;
		count++;
	}
	//���O����  static method
	static int getCount(){
		return count;
	}
	
	//��k�w�q
	void addSpeed() {
		Speed*=1.2;
	}
	void reduceSpeed() {
		Speed*=0.7;
	}
}
