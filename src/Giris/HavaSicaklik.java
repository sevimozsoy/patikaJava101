package Giris;

import java.util.Scanner;

public class HavaSicaklik {
    public static void main(String[] args){
        int degree;

        Scanner scn = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        degree = scn.nextInt();

        if(degree >= 25){
            System.out.println("Yüzmeye gidebilirsin.");
        } else if (degree >= 15) {
            System.out.println("Pikniğe gidebilirsin.");
        } else if (degree >= 5) {
            System.out.println("Sinemaya gidebilirsin.");
        }else{
            System.out.println("Kayak yapmaya gidebilirsin");
        }
    }
}
