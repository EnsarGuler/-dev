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
public class sayıtersten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi= input.nextInt();
        System.out.print("tersi:");
        while(sayi >0){
            System.out.print(sayi%10);
            sayi /=10;
        }
    }
    
}
