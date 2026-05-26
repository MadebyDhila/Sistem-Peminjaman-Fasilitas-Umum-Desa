/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8;

/**
 *
 * @author WINDOWS 11
 */

public class Jenis extends Fasilitas {
    private String jenis;

    public Jenis(String nama, int jumlah, String kondisi, String jenis) {
        super(nama, jumlah, kondisi);
        this.jenis = jenis;
    }
    
    // ABSTRACT METHODS    
       @Override
    public boolean validasiData() {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Error: Nama fasilitas tidak boleh kosong!");
            return false;
        }
        if (jumlah <= 0) {
            System.out.println("Error: Jumlah harus lebih dari 0!");
            return false;
        }
        return true;
    }
    
    @Override
    public void tampilInfoLengkap() {
        System.out.println("\n=== DATA LENGKAP FASILITAS ===");
        System.out.println("Nama Fasilitas  : " + nama);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Kondisi         : " + kondisi);
        System.out.println("Jenis           : " + jenis);
        System.out.println("Status          : " + getStatusFasilitas());
        System.out.println("Tersedia        : " + (isTersedia() ? "Ya" : "Tidak"));
    }
    
    @Override
    public String getStatusFasilitas() {
        if (kondisi.equalsIgnoreCase("Baik") || kondisi.equalsIgnoreCase("Baru")) {
            return "Siap Pakai";
        } else if (kondisi.equalsIgnoreCase("Rusak")) {
            return "Perlu Perbaikan";
        } else {
            return "Tidak Tersedia";
        }
    }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    @Override
    public String toString() {
        return nama + " | " + jumlah + " | " + kondisi + " | " + jenis;
    }
}
