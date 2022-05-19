package Giris;

import java.util.Scanner;

public class DaireAlanVeCevreHesaplama {
    public static void main(String[] args){
        final double PI = 3.14;
        double alan, cevre, dilim;
        int yariCap, merkezAci;

        Scanner scn = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        yariCap = scn.nextInt();

        cevre = 2 * PI * yariCap;
        System.out.println("Çevre: " + cevre);

        alan = PI * Math.pow(yariCap,2);
        System.out.println("Alan: " + alan);

        System.out.print("Merkez açı ölçüsü giriniz:");
        merkezAci = scn.nextInt();

        dilim = (PI * Math.pow(yariCap,2) * merkezAci)/360;
        System.out.println("Dilim açısı:" + dilim);

    }
}
