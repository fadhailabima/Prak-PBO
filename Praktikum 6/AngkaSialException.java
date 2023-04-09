/**
* File	: AngkaSialException.java 01/04/23
* Penulis	: Fadhail Athaillah Bima / 24060121140172
* Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
*
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}