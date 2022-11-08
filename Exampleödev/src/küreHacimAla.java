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
public class küreHacimAla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI =3.14;
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen kürenin yarıçapını r giriniz:");
        double r = input.nextDouble();
        double alan = 4*PI*Math.pow(r, 2);
        System.out.println("Kürenin alanı:" +alan);
        double hacim = (4*PI*Math.pow(r, 3)) / 3;
        System.out.println("Kürenin hacmi:" +hacim);
        
        
        
    }
    
}
