/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktoriyel_hesabı_for;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Faktoriyel_HesabıFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("hesaplanacak sayıyı giriniz:");
        int hs = s.nextInt();
        int fak=1;
        for(int sbt=1;sbt<=hs;sbt++){
            fak=fak*sbt;
           
        }  System.out.println(hs+"!="+fak);
    }
    
}
