/*
Pembuat : Fadhail Athaillah Bima
NIM     : 24060121140172
Tanggal : 10 Mei 2023
Lab     : B1
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}