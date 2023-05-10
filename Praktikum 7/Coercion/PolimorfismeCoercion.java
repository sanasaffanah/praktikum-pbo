 //File		: PolimorfismeCoercion.java
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 03/05/23
 //Deskripsi: Program polimorfisme dengan coercion

public class PolimorfismeCoercion {

	public static int kuadrat(int bilangan) {
		return bilangan*bilangan;
	}
	
	public static void main(String[] args) {
		//deklarasi objek integer
		Integer bilangan = 10;
		
		//objek integer 'dipaksa' untuk diubah
		//menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);
		
		System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
	}
}