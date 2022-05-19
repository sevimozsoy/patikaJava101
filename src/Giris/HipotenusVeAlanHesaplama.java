package Giris;

import java.util.Scanner;

public class HipotenusVeAlanHesaplama {
    public static void main(String[] args) {
        double dikKenar, dikKenar1, hipotenus, alan;
        Scanner scn = new Scanner(System.in);
        System.out.print("İlk Dik Kenar Uzunluğunu Giriniz:");
        dikKenar = scn.nextInt();
        System.out.print("İkinci Dik Kenar Uzunluğunu Giriniz:");
        dikKenar1 = scn.nextInt();

        if (dikKenar == 1 && dikKenar1 == 2) {
            System.out.println("Girdiğiniz değer üçgen oluşturmaz");

        } else if (dikKenar1 == 1 && dikKenar == 2) {
            System.out.println("Girdiğiniz değer üçgen oluşturmaz");
        } else {

            hipotenus = Math.sqrt(Math.pow(dikKenar, 2) + Math.pow(dikKenar1, 2));
            System.out.print("Hipotenus uzunluğu:" + hipotenus);

            System.out.println("\n");

            alan = (dikKenar * dikKenar1) / 2;
            System.out.println("Alan:" + alan);
        }
    }
}
