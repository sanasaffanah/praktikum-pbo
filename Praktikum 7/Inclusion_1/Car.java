 //File		: Car.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 03/05/23
 //Deskripsi: Program implementasi polimorfisme inclusion dengan sub class Car

public class Car extends Vehicle {
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}