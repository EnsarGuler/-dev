/*
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensar
 */
import java.util.Scanner; // sayı tanımlamak
public class Exödev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz:");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int b = input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz");
        int c = input.nextInt();
        int toplam = a + b + c;
        int carpim = a * b * c;
        double ort = (double) toplam / 3;
        System.out.println("Ortalama: "+ ort + ", Toplam: " + toplam +", ve çarpımı: "+carpim);
        
        
       
        
       
              
        
   
    }
    
}
