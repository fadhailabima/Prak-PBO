/**
 * File      : Lambdalist.java	06/06/2023
 * Penulis	 : Fadhail Athaillah Bima - 24060121140172
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

 import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Faiq");
         mahasiswaList.add("Fizi");
         mahasiswaList.add("Ganar");
 
         //lambda digunakan sebagai parameter pada method
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }