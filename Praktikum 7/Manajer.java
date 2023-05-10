/*
File    : Manajer.java
Pembuat : Fadhail Athaillah Bima
NIM     : 24060121140172
Tanggal : 10 Mei 2023
Lab     : B1
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}