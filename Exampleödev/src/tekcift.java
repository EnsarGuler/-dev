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
public class tekcift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi =input.nextInt();
        if (sayi%2==0){
            System.out.println("çift"); }
        else 
            {System.out.println("tek");}
               
        
            
        
    }
    
}
