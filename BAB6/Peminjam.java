/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6;

/**
 *
 * @author WINDOWS 11
 */

public class Peminjam extends Orang {
    private String dusun;
    private String rt;
    private String rw;

    public Peminjam(String nama, int umur, String alamat, String dusun, String rt, String rw) {
        super(nama, umur, alamat);
        this.dusun = dusun;
        this.rt = rt;
        this.rw = rw;
    }
    
    // ABSTRACT METHODS      
    @Override
    public boolean validasiData() {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
            return false;
        }
        if (umur <= 0) {
            System.out.println("Error: Umur harus lebih dari 0!");
            return false;
        }
        if (alamat == null || alamat.trim().isEmpty()) {
            System.out.println("Error: Alamat tidak boleh kosong!");
            return false;
        }
        return true;
    }
    
    @Override
    public void tampilInfoLengkap() {
        System.out.println("\n=== DATA LENGKAP PEMINJAM ===");
        System.out.println("Nama Peminjam   : " + nama);
        System.out.println("Umur            : " + umur + " tahun");
        System.out.println("Alamat          : " + alamat);
        System.out.println("Dusun           : " + dusun);
        System.out.println("RT              : " + rt);
        System.out.println("RW              : " + rw);
        System.out.println("Kategori        : " + getKategori());
        System.out.println("Status Dewasa   : " + (isDewasa() ? "Dewasa" : "Belum Dewasa"));
    }
    
    @Override
    public String getKategori() {
        if (umur < 12) {
            return "Anak-anak";
        } else if (umur < 17) {
            return "Remaja";
        } else if (umur < 60) {
            return "Dewasa";
        } else {
            return "Lansia";
        }
    }

    // Getter Setter
    public String getDusun() { return dusun; }
    public void setDusun(String dusun) { this.dusun = dusun; }
    public String getRt() { return rt; }
    public void setRt(String rt) { this.rt = rt; }
    public String getRw() { return rw; }
    public void setRw(String rw) { this.rw = rw; }

    @Override
    public String toString() {
        return nama + " | " + umur + " | " + alamat + " | " + dusun + " | " + rt + " | " + rw;
    }
}
