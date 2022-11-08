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

public class haftagünü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi1, sayi;
        System.out.println("Sayi:");
        sayi1 = input.nextInt();
        sayi = (sayi1) % 7;
        if (sayi == 1) {
            System.out.println("Pazartesi");
        } else if (sayi == 2) {
            System.out.println("Salı");
        } else if (sayi == 3) {
            System.out.println("Çarşamba");
        } else if (sayi == 4) {
            System.out.println("Perşembe");
        } else if (sayi == 5) {
            System.out.println("Cuma");
        } else if (sayi == 6) {
            System.out.println("Cumartesi");
        } else if (sayi == 7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Hatalı sayı girdiniz.");
        }

    }

}
