/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; 
/**
 *
 * @author ensar
 */
public class AcıCevirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.14;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Lütfen açı giriniz:");
        double acı =input.nextDouble();
        
        double radyan = (acı*PI / 180);
        System.out.println("Radyan:" +radyan );
        
        double rad = (double) Math.toRadians(acı);
        System.out.println("Radyan sistem:" +rad);
        
        double gradyan = (acı*200) / 180;
        System.out.println("Gradyan:" +gradyan);
        
        
        
        
        
    }
    
}
