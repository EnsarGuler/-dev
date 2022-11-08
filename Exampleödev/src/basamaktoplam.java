/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ensar
 */import java.util.Scanner;
public class basamaktoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz: ");
        int N= input.nextInt();
        int toplam =0;
        while (N>0) {
            int kalan= N %10;
            toplam += kalan ;
            N= N/10;
        }
        System.out.println(toplam);
        
    }
    
}
