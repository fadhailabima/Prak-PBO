/*
* Nama File : MBujurSangkar.java
* Nama      : Fadhail Athaillah Bima
* NIM       : 24060121140172
* Tanggal   : 31/03/2023
* Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
* Lab	    : B1
*/

import java.util.Scanner;

class MBujurSangkar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+
				" satuan adalah "+bs.hitungLuas(sisi));
	}
}