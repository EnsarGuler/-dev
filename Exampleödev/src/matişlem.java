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
public class matişlem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a = input.nextInt();
        double işlem= Math.sqrt((1+ a) / (1 + (1 / Math.pow(a, 2))) ) + (1 / (a * Math.sqrt(a)));
        System.out.println("İşlem sonucu y1:" +işlem);
        
       
        
        
    }
    
}
