/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensar
 */
import java.util.Scanner; // java'nın util kütüphanesine ait Scanner class!ı import edildi.
public class fahre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in); // konsoldan değer almak için tanımladık
        System.out.println("Lütfen fahrenheit derecesi: ");
        double Fahrenheit = input.nextDouble();
        double Celcius = (Fahrenheit - 32) / 1.8 ;
        System.out.println("Celcius derecesi: " +Celcius);
        
    }
    
}
