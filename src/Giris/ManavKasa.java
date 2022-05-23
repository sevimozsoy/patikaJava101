package Giris;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){
        double toplam = 0, armut = 2.14, elma = 3.67, domates = 1.11, muz= 0.95, patlican = 5.00;
        int kilo;

        Scanner scn = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ?:");
        kilo = scn.nextInt();
        toplam += (kilo * armut);

        System.out.print("Elma  Kaç Kilo ?:");
        kilo = scn.nextInt();
        toplam += (kilo * elma);

        System.out.print("Domates  Kaç Kilo ?:");
        kilo = scn.nextInt();
        toplam += (kilo * domates);

        System.out.print("Muz  Kaç Kilo ?:");
        kilo = scn.nextInt();
        toplam += (kilo * muz);

        System.out.print("Patlıcan  Kaç Kilo ?:");
        kilo = scn.nextInt();
        toplam += (kilo * patlican);

        System.out.println(-Math.pow(2,31));
    }
}
