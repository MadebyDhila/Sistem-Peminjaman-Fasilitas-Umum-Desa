/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author WINDOWS 11
 */

public class Jenis extends Fasilitas implements Identitas, Laporan {
    private String jenis;

    public Jenis(String nama, int jumlah, String kondisi, String jenis) {
        super(nama, jumlah, kondisi);
        this.jenis = jenis;
    }
    
    @Override
    public boolean validasiData() {
        if (nama == null || nama.trim().isEmpty()) return false;
        if (jumlah <= 0) return false;
        return true;
    }
    
    @Override
    public void tampilInfoLengkap() {
        System.out.println("Fasilitas: " + nama + " | Jenis: " + jenis + " | Kondisi: " + kondisi);
    }
    
    @Override
    public String getStatusFasilitas() {
        if (kondisi.equalsIgnoreCase("Baik") || kondisi.equalsIgnoreCase("Baru")) {
            return "Siap Pakai";
        } else {
            return "Perlu Perbaikan";
        }
    }
    
    // INTERFACE IDENTITAS
    @Override
    public void tampilkanIdentitas() {
        System.out.println("Identitas Fasilitas: " + nama + " | " + jenis);
    }
    
    @Override
    public String getIdentitasLengkap() {
        return nama + " (" + jenis + ") - " + kondisi;
    }
    
    // INTERFACE LAPORAN
    @Override
    public void cetakLaporan() {
        System.out.println("LAPORAN FASILITAS: " + nama + " | Jml: " + jumlah + " | " + kondisi);
    }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    @Override
    public String toString() {
        return nama + " | " + jumlah + " | " + kondisi + " | " + jenis;
    }
}
