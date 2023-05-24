 //File		: Lingkaran.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 17/05/23
 //Deskripsi: Implementasi Lingkaran sebagai BangunDatar
 

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}