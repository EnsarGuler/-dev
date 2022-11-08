/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ensar
 */
import java.util.Scanner;

public class nsayıçarp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;
        int a = 1;
        int b = 2;
        while (a <= sayi && b <= sayi) {
            toplam1 = toplam1 + a;
            toplam2= toplam2 + b;
            a = a + 2;
            b = b + 2;
        }
        System.out.println("Tek: " + toplam1);
        System.out.println("Çift: " + toplam2);

    }

}
