 //File		: Asersi1.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 29/03/23
 //Deskripsi: Program untuk menunjukkan asersi
 
 
public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x>0){
			System.out.println("x bilangan postif");
		}else{
			assert(x<0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}