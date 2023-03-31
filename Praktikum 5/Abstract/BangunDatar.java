
/*
*BangunDatar.java 31/03/2023
* Penulis: Fadhail Athaillah Bima
* Nim : 24060121140172
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
*/

package org.bangundatar.BangungDatar;

public abstract class BangunDatar{
	
	protected double luas;
	
	public abstract double hitungLuas (double sisi);
	
	public void setLuas (double a) {
		luas = a;
	}

	public double getLuas (){
		return luas;
	}
}