/*
* Nama File : OperasiTitikk.java 
* Nama/NIM  : Fadhail Athaillah Bima/24060121140172
* Tanggal   : 07/03/2023
* Deskripsi : kelas yang berisi berbagai operasi terhadap objek Titik.
*/

public class OperasiTitik{
	
	public void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);	
	}
	
	public void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	
}