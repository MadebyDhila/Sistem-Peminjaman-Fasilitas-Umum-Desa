/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author WINDOWS 11
 */

public abstract class Fasilitas {
    protected String nama;
    protected int jumlah;
    protected String kondisi;

    public Fasilitas(String nama, int jumlah, String kondisi) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
    }
    
    // ABSTRACT METHODS
    public abstract boolean validasiData();
    public abstract void tampilInfoLengkap();
    public abstract String getStatusFasilitas();

    // Method Overloading
    public void tampilData() {
        System.out.println("Data Fasilitas");
    }
    public void tampilData(String nama) {
        System.out.println("Nama Fasilitas : " + nama);
    }
    public boolean isTersedia() {
        return kondisi.equalsIgnoreCase("Baik") || kondisi.equalsIgnoreCase("Baru");
    }

    // Getter Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public String getKondisi() { return kondisi; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }
    
    @Override
    public String toString() {
        return nama + " | " + jumlah + " | " + kondisi;
    }
}
