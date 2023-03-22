//File		: Poligon.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 21/03/23
 //Deskripsi: Super Class Poligon
 
package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
} 