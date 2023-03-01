 //File		: OperasiTitik.java	
 //Penulis	: Sana Saffanah
 //NIM		: 24060121140143
 //Tanggal	: 01/03/23
 //Deskripsi: Kelas yang berisi realisasi program kelas Operasi Titik


class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat*-1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis *-1;
		titik.setAbsis(absis);
	}
	public void refleksiX(Titik titik){
		refleksiSumbuX(titik);
	}
	public void refleksiY(Titik titik){
		refleksiSumbuY(titik);
	}
}