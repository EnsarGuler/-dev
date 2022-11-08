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
public class üçgenödev {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen birinci kenar giriniz(a):");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci kenar giriniz (b):");
        int b = input.nextInt();
        System.out.println("Lütfen üçüncü kenar giriniz(c):");
        int c = input.nextInt();
        if (a==b && a==c)
            System.out.println("Eşkenar Üçgendir");
        else if (a==b || a==c || b==c)
            System.out.println("Üçgen ikizkenardır.");
        else 
            System.out.println("Üçgen çeşitkenardır.");
        
                
    }
    
}
