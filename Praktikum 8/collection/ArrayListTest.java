 //File		: ArrayListTest.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 17/05/23
 //Deskripsi: Program penggunaan objek ArrayList sebagai collection class
 
 import java.until.ArrayList;
 
 public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayList yang harga dapat berisi objek String
		ArrayList<String>strings = new ArrayList<String>();
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for (String s : strings){
			System.out.print(s+" ");
		}
	}
}