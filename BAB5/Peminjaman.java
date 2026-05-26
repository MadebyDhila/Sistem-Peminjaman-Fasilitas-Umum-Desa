/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author WINDOWS 11
 */

public class Peminjaman {
    protected String namaPeminjam;
    protected String namaBarang;
    protected int jumlah;

    public Peminjaman(String namaPeminjam, String namaBarang, int jumlah) {
        this.namaPeminjam = namaPeminjam;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
    }
    
    // Method Overloading
    public void tampilData() {
        System.out.println("Data Peminjaman");
    }
    public void tampilData(String namaPeminjam) {
        System.out.println("Nama Peminjam : " + namaPeminjam);
    }

    // Getter Setter
    public String getNamaPeminjam() { return namaPeminjam; }
    public void setNamaPeminjam(String namaPeminjam) { this.namaPeminjam = namaPeminjam; }
    public String getNamaBarang() { return namaBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
   
    @Override
    public String toString() {
        return namaPeminjam + " | " + namaBarang + " | " + jumlah;
    }
}
