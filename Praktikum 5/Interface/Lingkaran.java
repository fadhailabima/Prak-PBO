package org.bangundatar;

/**
*	Lingkaran.java 31/03/2023
*	Penulis : Fadhail Athaillah Bima
*   Nim     : 24060121140172
*	Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}