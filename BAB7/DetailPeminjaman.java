/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author WINDOWS 11
 */

public class DetailPeminjaman extends Peminjaman {
    private String tanggal;
    private String status;

    public DetailPeminjaman(
        String namaPeminjam,
        String namaBarang,
        int jumlah,
        String tanggal,
        String status) {
            super(namaPeminjam, namaBarang, jumlah);
            this.tanggal = tanggal;
            this.status = status;
    }
    
    // ABSTRACT METHODS
    @Override
    public boolean validasiData() {
        if (namaPeminjam == null || namaPeminjam.trim().isEmpty()) {
            System.out.println("Error: Nama peminjam tidak boleh kosong!");
            return false;
        }
        if (namaBarang == null || namaBarang.trim().isEmpty()) {
            System.out.println("Error: Nama barang tidak boleh kosong!");
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
        // Kosong karena pakai GUI
    }
    
    @Override
    public String getStatusPeminjaman() {
        return status;
    }

    // Getter Setter
    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
 
    @Override
    public String toString() {
        return namaPeminjam + " | " + namaBarang + " | " + jumlah + " | " + tanggal + " | " + status;
    }
}
