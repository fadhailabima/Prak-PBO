/*
* Nama File : MOperasiTitikk.java 
* Nama/NIM  : Fadhail Athaillah Bima/24060121140172
* Tanggal   : 07/03/2023
* Deskripsi : program utama yang memanfaatkan OperasiTitik.
*/

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiSumbuX(t); // hasil ?
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiSumbuY(t); // hasil ?
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
	}
 }