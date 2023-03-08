 //File		: MPoligon.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 08/03/23
 //Deskripsi: Driver class untuk poligon dan segitiga
 
 package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
		Segitiga segitiga = new Segitiga(7,24,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
	}
}
		