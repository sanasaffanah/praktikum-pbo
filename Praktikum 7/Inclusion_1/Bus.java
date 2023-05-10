 //File		: Bus.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 03/05/23
 //Deskripsi: Program implementasi polimorfisme inclusion dengan sub class Bus


public class Bus extends Vehicle{
	void calRent(int jarak, float harga){
		float fare = jarak * harga;
		fare = fare - 5.00f;
		System.out.println("harga sewa bis = "+fare);
	}
}