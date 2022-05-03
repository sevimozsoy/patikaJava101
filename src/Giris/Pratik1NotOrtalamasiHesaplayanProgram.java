package Giris;

import java.util.Scanner;

public class Pratik1NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner scn = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat = scn.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizik = scn.nextInt();
        System.out.print("Kimya notunu giriniz:");
        kimya = scn.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        turkce = scn.nextInt();
        System.out.print("Tarih notunu giriniz:");
        tarih = scn.nextInt();
        System.out.print("Müzik notunu giriniz:");
        muzik = scn.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam/6.0;
        System.out.println("Ortalamanız:" + ortalama);

        String gectiMi = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println(gectiMi);
    }
}
