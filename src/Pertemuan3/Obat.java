/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author ASUS
 */
public class Obat {
      String nama;
    String jumlah;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    
    public static void main(String[] args) {
        Obat kap = new Obat();
        
        kap.setNama("Molexflu");
        kap.setJumlah("Tiga");
        
        System.out.println("AMBIL NAMA = "+kap.getNama());
        String jum = kap.getJumlah();
        System.out.println("AMBIL JUMLAH = "+jum);
}

}
