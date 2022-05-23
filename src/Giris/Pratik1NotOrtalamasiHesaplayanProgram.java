package Giris;

import java.util.Scanner;

public class Pratik1NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, dersSayisi = 0;
        Scanner scn = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat = scn.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        }else{
            dersSayisi++;
        }

        System.out.print("Fizik notunu giriniz:");
        fizik = scn.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }else{
            dersSayisi++;
        }

        System.out.print("Kimya notunu giriniz:");
        kimya = scn.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }else{
            dersSayisi++;
        }

        System.out.print("Türkçe notunu giriniz:");
        turkce = scn.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }else{
            dersSayisi++;
        }

        System.out.print("Tarih notunu giriniz:");
        tarih = scn.nextInt();
        if (tarih < 0 || tarih > 100) {
            tarih = 0;
        }else{
            dersSayisi++;
        }

        System.out.print("Müzik notunu giriniz:");
        muzik = scn.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }else{
            dersSayisi++;
        }

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / dersSayisi;
        System.out.println("Ortalamanız:" + ortalama);


        String gectiMi = ortalama >= 55 ? "Geçti" : "Kaldı";

        System.out.println(gectiMi);
    }
}
