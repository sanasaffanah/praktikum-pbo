 //File		: AngkaSialException.java	
 //File 	: AngkaSialException.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 29/03/23
 //Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 
 
public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}
