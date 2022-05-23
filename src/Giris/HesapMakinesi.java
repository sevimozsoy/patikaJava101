package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        String islem;
        int sayi1, sayi2;
        Scanner scn = new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi (Toplama,Çıkarma,Bölme,Çarpma) giriniz:");
        islem = scn.next().toLowerCase();
        System.out.print("İşlemi yaparken kullanacağınız ilk sayıyı giriniz:");
        sayi1 = scn.nextInt();
        System.out.print("İşlemi yaparken kullanacağınız ikinci sayıyı giriniz:");
        sayi2 = scn.nextInt();

        switch (islem) {
            case "toplama":
                System.out.printf("Sonuç: %d", sayi1 + sayi2);
                break;
            case "çıkarma":
                System.out.printf("Sonuç: %d", sayi1 - sayi2);
                break;
            case "çarpma":
                System.out.printf("Sonuç: %d", sayi1 * sayi2);
                break;
            case "bölme":
                try {
                    System.out.printf("Sonuç: %d", sayi1 / sayi2);
                } catch (ArithmeticException e) {
                    System.out.println("Bölen sayı sıfır olamaz");
                }
                break;
            default:
                System.out.println("İşlemi yanlış girdiniz.");
        }
    }
}
