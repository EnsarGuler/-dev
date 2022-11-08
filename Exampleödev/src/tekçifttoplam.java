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
public class tekçifttoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int N= input.nextInt();
        
        int S= 1;
        int tek_toplam=0;
        int cift_toplam=0;
        
        while (S<=N)
        {
            if ( S%2 ==0)
            {
        cift_toplam = cift_toplam + S;
        }
            else {
                tek_toplam= tek_toplam +S ;
            }
            S = S+1;}
        int toplam = tek_toplam + cift_toplam;
        System.out.println("Toplam: " +toplam);
        System.out.println("Tek: "+tek_toplam);
        System.out.println("Çift: " +cift_toplam);
            }
        
        
    }
    
    

