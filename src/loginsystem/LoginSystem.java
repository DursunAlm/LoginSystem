/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginsystem;
/*
 * Patika dev java101 dersi kapsamındaki koşullu durumlar konusunun sonundaki kullanıcı girisi
 * ödevi 
*/
import java.util.Scanner;

/**
 *
 * @author alimdursun
 */
public class LoginSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ad="Patika";
        String sifre="patika123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("kullanici adi: ");
        String username=scanner.nextLine();
        System.out.println("Sifre: ");
        String password=scanner.nextLine();
        if(username.equals(ad) && password.equals(sifre)){
            System.out.println("giris yapıldı");
        }else if(username.equals(ad)&& !password.equals(sifre)){
            System.out.println("sifre hatalı");
            System.out.println("yeni şifre belirlemek istiyor musunuz?");
            String cevap=scanner.nextLine();
            if(cevap.equals("evet")){
                System.out.println("yeni şifrenizi girin: ");
                String yeniSifre=scanner.nextLine();
                if(yeniSifre.equals(password) || yeniSifre.equals(sifre)){
                    System.out.println("sifreniz önceki sifrenizle aynı olamaz.");
                }else{
                    System.out.println("yeni sifreniz oluşturuldu");
                    sifre=yeniSifre;
                }
            }
        }
        System.out.println(sifre);
    }
    
}
