/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author WINDOWS 11
 */

public class Peminjam extends Orang implements Identitas, Denda, Laporan {
    private String dusun;
    private String rt;
    private String rw;
    private double denda;

    public Peminjam(String nama, int umur, String alamat, String dusun, String rt, String rw) {
        super(nama, umur, alamat);
        this.dusun = dusun;
        this.rt = rt;
        this.rw = rw;
        this.denda = 0;
    }
    
    @Override
    public boolean validasiData() {
        if (nama == null || nama.trim().isEmpty()) return false;
        if (umur <= 0) return false;
        if (alamat == null || alamat.trim().isEmpty()) return false;
        return true;
    }
    
    @Override
    public void tampilInfoLengkap() {
        System.out.println("Nama: " + nama + " | Dusun: " + dusun + " RT " + rt + " RW " + rw);
    }
    
    @Override
    public String getKategori() {
        if (umur < 17) return "Remaja";
        if (umur < 60) return "Dewasa";
        return "Lansia";
    }
    
    // INTERFACE IDENTITAS
    @Override
    public void tampilkanIdentitas() {
        System.out.println("Identitas: " + nama + " | " + dusun + " | RT " + rt + " RW " + rw);
    }
    
    @Override
    public String getIdentitasLengkap() {
        return nama + " | " + alamat + " | Dusun " + dusun + " RT " + rt + " RW " + rw;
    }
    
    // INTERFACE DENDA
    @Override
    public double hitungDenda() {
        return denda;
    }
    
    @Override
    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    // INTERFACE LAPORAN
    @Override
    public void cetakLaporan() {
        System.out.println("LAPORAN PEMINJAM: " + nama + " | Denda: Rp " + denda);
    }
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
