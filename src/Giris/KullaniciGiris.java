package Giris;

import java.util.Locale;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName = "patika", password = "java123";
        String userEntryUserName, userEntryPassword, newPassword;

        Scanner scn = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        userEntryUserName = scn.nextLine();

        System.out.print("Şifrenizi giriniz:");
        userEntryPassword = scn.nextLine();

        if (userName.matches(userEntryUserName)){
            if(password.matches(userEntryPassword)){
                System.out.println("Sisteme giriş yaptınız");
            }else{
                System.out.print("Şifreniz hatalı, yeni şifre oluşturmak ister misiniz evet/hayır?");
                newPassword = scn.nextLine().toLowerCase();
                switch(newPassword){
                    case "evet":
                        System.out.print("Yeni şifreyi giriniz:");
                        password = scn.nextLine();
                        if(password.matches(userEntryPassword)){
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }else{
                            System.out.println("Şifre oluşturuldu.");
                        }
                        break;
                    case "hayır":
                        System.out.println("Şifreniz hatalı.");
                }
            }
        }else{
            System.out.println("Kullanıcı adınız veya parolanız hatalı.");
        }
    }
}
