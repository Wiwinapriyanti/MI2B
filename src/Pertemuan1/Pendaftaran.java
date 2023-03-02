/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author ASUS
 */
public class Pendaftaran {
     public static void main(String[]args){
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama="wiwin";
        mhs.nobp="2071";
        mhs.kelas="mi2b";
        mhs.prodi="mi";
        mhs.jurusan="TI";
        
         System.out.println("Nama : "+mhs.nama+"\n"
                    +"No BP :"+mhs.nobp+"\n" 
                        +"Kelas :"+mhs.kelas+"\n"
                            +"Prodi :"+mhs.kelas+"\n"
                                +"Jurusan :"+mhs.jurusan+"\n");
     }
}
