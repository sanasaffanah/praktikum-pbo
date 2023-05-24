 //File		: BangunDatarGeneric.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 17/05/23
 //Deskripsi: Kelas konstruksi generic untuk BangunDatar
 

//public class BangunDatarGeneric<T extends BangunDatar>{
	//private T bangunDatar;
	
	//public void set(T tipeBangunDatar){
	//	bangunDatar = tipeBangunDatar;
	//}
	
	//public T get(){
	//	return bangunDatar;
	//}
	
	//public double hitungKeliling();
	//	return bangunDatar.hitungKeliling();
	//}
//}

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
	//Parameter generik akan terubah jika T diganti menjadi T1, 
	//dimana dapat memberi penamaan pada parameter generik yang dapat dibedakan secara lebih spesifik dan deskriptif
	//pada saat di kelas tersebut menggunakan lebih dari 1 parameter generik
}

 
