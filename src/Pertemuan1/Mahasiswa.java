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
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
  
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
        
        
        System.out.println("\n");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama="maretha";
        mhs2.nobp="2053";
        mhs2.kelas="mi2b";
        mhs2.prodi="mi";
        mhs2.jurusan="TI";
        
        System.out.println("Nama : "+mhs2.nama+"\n"
                    +"No BP :"+mhs2.nobp+"\n" 
                        +"Kelas :"+mhs2.kelas+"\n"
                            +"Prodi :"+mhs2.prodi+"\n"
                                +"Jurusan :"+mhs2.jurusan+"\n");
    
}
}
