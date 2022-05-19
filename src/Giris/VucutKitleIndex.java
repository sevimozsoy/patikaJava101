package Giris;

import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args){
        double height, bmi;
        int weight;

        Scanner scn = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        height = scn.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        weight = scn.nextInt();

        bmi = weight / Math.pow(height,2);
        System.out.print("Vücut Kitle İndeksiniz: " + bmi);
    }
}
