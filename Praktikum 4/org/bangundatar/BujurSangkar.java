 //File		: BujurSangkar.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 21/03/23
 //Deskripsi: Class Bujur Sangkar
 
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    // atribut
    private double panjangSisi;

    // konstruktor
    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    // method
    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return Math.pow(this.panjangSisi,2);
    }
}