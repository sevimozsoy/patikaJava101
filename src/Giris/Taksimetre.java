package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmBasina = 2.20, minTutar = 20, acilis = 10, odenecekTutar;
        int km;
        Scanner scn = new Scanner(System.in);
        System.out.print("Gideceğiniz uzaklığı giriniz:");
        km = scn.nextInt();

        odenecekTutar = (km * kmBasina) + acilis;

        if(odenecekTutar <= minTutar){
            System.out.println("Ödenecek tutar 20 tl'dir");
        }else{
            System.out.printf("Ödenecek tutar %.2f tl'dir" , odenecekTutar);
        }
    }
}
