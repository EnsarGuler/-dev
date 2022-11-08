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
public class ucgenalann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kenar uzunluk giriniz:");
        double uzunluk = input.nextDouble();
        System.out.println("Lütfen kenar yukseklik giriniz:");
        double yukseklik = input.nextDouble();
        double alan  = ( uzunluk * yukseklik ) / 2;
        System.out.println("Üçgenin alanı:" +alan);
       
    }
    
}
