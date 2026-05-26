/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author WINDOWS 11
 */

public class DetailPeminjaman extends Peminjaman implements Denda, Laporan {
    private String tanggal;
    private String status;
    private double denda;

    public DetailPeminjaman(String namaPeminjam, String namaBarang, int jumlah, String tanggal, String status) {
        super(namaPeminjam, namaBarang, jumlah);
        this.tanggal = tanggal;
        this.status = status;
        this.denda = 0;
    }
    
    @Override
    public boolean validasiData() {
        if (namaPeminjam == null || namaPeminjam.trim().isEmpty()) return false;
        if (namaBarang == null || namaBarang.trim().isEmpty()) return false;
        if (jumlah <= 0) return false;
        return true;
    }
    
    @Override
    public void tampilInfoLengkap() {
        System.out.println("Peminjaman: " + namaPeminjam + " meminjam " + namaBarang);
    }
    
    @Override
    public String getStatusPeminjaman() {
        return status;
    }
    
    // INTERFACE DENDA
    @Override
    public double hitungDenda() {
        if (status.equalsIgnoreCase("Dikembalikan")) {
            return denda;
        }
        return 0;
    }
    
    @Override
    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    // INTERFACE LAPORAN
    @Override
    public void cetakLaporan() {
        System.out.println("LAPORAN PEMINJAMAN: " + namaPeminjam + " meminjam " + namaBarang);
        System.out.println("Tanggal: " + tanggal + " | Status: " + status + " | Denda: Rp " + denda);
    }
    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return namaPeminjam + " | " + namaBarang + " | " + jumlah + " | " + tanggal + " | " + status;
    }
}
