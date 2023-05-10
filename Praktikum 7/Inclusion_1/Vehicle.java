 //File		: Vehicle.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 03/05/23
 //Deskripsi: Program implementasi polimorfisme inclusion dengan super class Vehicle

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}

