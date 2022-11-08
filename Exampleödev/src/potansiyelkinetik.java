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
public class potansiyelkinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Maddenin hızı(v):");
        System.out.println("Maddenin kütlesi (m):");
        System.out.println("Yükseklik giriniz(h):");
        System.out.println("g kuvvetini giriniz:");
        
        
        double v = input.nextDouble();
        double m = input.nextDouble();
        double h = input.nextDouble();
        double g = input.nextDouble();
        
        double kinetik = (m*Math.pow(v, 2)) / 2;
        double potansiyel = (m*g*h);
        
        System.out.println("Maddenin kinetik enerjisi:" +kinetik);
        System.out.println("Maddenin potansiyel enerjisi:" +potansiyel);
       
        

    }
    
}
