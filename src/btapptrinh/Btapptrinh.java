/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btapptrinh;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Btapptrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a, b, x;
        System.out.println("Nhap a");
        a=sc.nextDouble();
        System.out.println("Nhap b");
        b=sc.nextDouble();
        if(a==0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(b==0){
            System.out.println("Phuong trinh vo so nghiem");
        }
        else {
            x=-b/a;
            System.out.println("ket qua x="+x);
      
    }
    
}
}
