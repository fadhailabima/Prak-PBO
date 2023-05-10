/*
Pembuat : Fadhail Athaillah Bima
NIM     : 24060121140172
Tanggal : 10 Mei 2023
Lab     : B1
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga) {
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}