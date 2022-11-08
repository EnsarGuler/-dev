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
public class teksayıtopödev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
      
        
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i=1;i<=sayi;++i)
        {
            toplam +=i++; }
        { 
            System.out.println("" +toplam);
        }
        
    }
    
}
