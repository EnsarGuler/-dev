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

public class metredönüş {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int metre= input.nextInt();
        int cm= metre*100;
        System.out.println("Cm: "+cm);
        int dm= metre*10;
        System.out.println("dm: "+dm);
        
    }
    
}
