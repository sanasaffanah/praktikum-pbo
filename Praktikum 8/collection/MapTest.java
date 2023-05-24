 //File		: MapTest.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 17/05/23
 //Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 
 import java.util.*;
 
 public class MapTest {
	public static void main(String[] args) {
		//kunci-> integer, nilai-> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection Set
		Set<integer> key = map.keySet();
		//iterasi untuk mengambil keseluruhan nilai dari kunci
		for(Integer k : keys){
			System.out.println(k + " : " + map.get(k));
		}
	}
}