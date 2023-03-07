/*
* Nama File : Titik.java 
* Nama/NIM  : Fadhail Athaillah Bima/24060121140172
* Tanggal   : 07/03/2023
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

 public class Titik{
	private double absis; //absis
	private double ordinat; //ordinat
	private static double counterTitik; //penghitung objek titik yang telah dibuat
	//tugas
	public Titik(double a,double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	//end tugas
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
		
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public double getCounterTitik(){
		return counterTitik;
	}

 }