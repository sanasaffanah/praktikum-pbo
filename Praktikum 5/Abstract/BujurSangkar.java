 //File		: BujurSangkar.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 25/03/23
 //Deskripsi: File class implementasi method dari abstract class Bangun Datar


public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
	// Akan terjadi error apabila implementasi metode dari abstract tidak dibuat
    // File BujurSangkar tidak bisa dicompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}