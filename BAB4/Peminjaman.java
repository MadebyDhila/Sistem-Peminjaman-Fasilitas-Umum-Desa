/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author WINDOWS 11
 */

import BAB3.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Peminjaman {
    protected String idTransaksi;
    protected String idPeminjam;
    protected String idFasilitas;
    protected int lamaPinjam;
    protected LocalDate tanggalPinjam;
    protected String status;
    
    public Peminjaman(String idTransaksi, String idPeminjam, String idFasilitas, int lamaPinjam) {
        this.idTransaksi = idTransaksi;
        this.idPeminjam = idPeminjam;
        this.idFasilitas = idFasilitas;
        this.lamaPinjam = lamaPinjam;
        this.tanggalPinjam = LocalDate.now();
        this.status = "Dipinjam";
    }
    
    public String getIdTransaksi() { return idTransaksi; }
    public String getIdPeminjam() { return idPeminjam; }
    public String getIdFasilitas() { return idFasilitas; }
    public int getLamaPinjam() { return lamaPinjam; }
    public LocalDate getTanggalPinjam() { return tanggalPinjam; }
    public String getStatus() { return status; }
    
    public void setStatus(String status) { this.status = status; }
    
    public LocalDate getTanggalHarusKembali() {
        return tanggalPinjam.plusDays(lamaPinjam);
    }
}
