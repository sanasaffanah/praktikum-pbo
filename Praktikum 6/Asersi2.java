 //File		: Asersi2.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 29/03/23
 //Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 
 
// class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}
//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 1.0;
		assert(jariJari>0) : "jari jari tidak boleh nol!!!"; // 
		Lingkaran lingkaran = new Lingkaran(jariJari); // 
		double kelilingLingkaran = lingkaran.hitungKeliling(); // 
		System.out.println("keliling lingkaran = " + kelilingLingkaran);
	}
}


// Pada modul 6 asersi dan eksepsi terdapat pertanyaan yaitu 'Ada yang kurang tepat pada program Asersi2 di atas?'
// Jawaban dari pertanyaan itu adalah ada yang kurang tepat yaitu jariJari > 0, seharusnya sintaks yang benar adalah jariJari != 0
// Alasannya adalah karena jika angka yang diinginkan bukan nol, maka angka negatif bisa masuk dan jika menggunakan > 0 maka jari-jari yang bernilai negatif tidak dapat dijalankan, sehingga jawaban yang tepat adalah dengan menggunakan jariJari != 0

