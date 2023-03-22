//File		: Kubus.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 21/03/23
 //Deskripsi: Class Kubus
 
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    // atribut
    private BujurSangkar permukaan;

    // konstruktor
    public Kubus(BujurSangkar bujurSangkar){
        this.permukaan = bujurSangkar;
    }

    // method
    public double hitungVolume(){
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}