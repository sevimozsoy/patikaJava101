package Giris;

import java.util.Scanner;

public class KdvTutariHesaplama {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Para değerini giriniz:");
        int paraDegeri = scn.nextInt();
        System.out.println("Kdv'siz fiyat:" + paraDegeri);
        double kdv = 0.18;
        double kdvFiyat = paraDegeri * kdv;
        System.out.printf("Kdv'li fiyat: %.1f", kdvFiyat + paraDegeri);
        System.out.print("Kdv tutarı:" + kdv);
    }
}
