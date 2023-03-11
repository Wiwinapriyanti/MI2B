/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;


public class KelasInput {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukan Nama: ");
            Person a = new Person();
            a.setName(sc.nextLine());
            System.out.println("Nama Anda Adalah "+a.getName());
            
            System.out.println("\nMasukan Nama Calon Suami: ");
            Person b = new Person();
            b.setName(sc.nextLine());
            System.out.println("Nama Calon Suami Anda Adalah "+b.getName());
    }
}
