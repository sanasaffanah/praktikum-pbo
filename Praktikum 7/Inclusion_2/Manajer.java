 //File		: Manajer.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 03/05/23
 //Deskripsi: Program polimorfisme inclusion dengan sub class Manajer
 
 
public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    public Manajer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}