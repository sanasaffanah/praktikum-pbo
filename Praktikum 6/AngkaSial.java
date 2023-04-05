 //File		: AngkaSial.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 29/03/23
 //Deskripsi: Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
 

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}


// Pada modul 6 asersi dan eksepsi terdapat pertanyaan yaitu 'Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?'
// Jawaban dari pertanyaan itu adalah jika class AngkaSial exception belum dibuat, maka kedua baris yaitu baris 12 dan baris 21 tidak bisa dieksekusi, sehingga perlu dibuat class AngkaSialException terlebih dahulu yaitu turunan dari class exception
