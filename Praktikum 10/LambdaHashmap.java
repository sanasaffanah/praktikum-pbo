 //File		: LambdaHashmap.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 06/06/23
 //Deskripsi: Implementasi Lambda pada Hashmap
 

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashmap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121140143", "Sana Saffanah"); 
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama)); 
    } 
}