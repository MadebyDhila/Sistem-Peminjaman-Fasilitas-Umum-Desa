/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author WINDOWS 11
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Peminjaman {
    public String idTransaksi;
    public String idPeminjam;
    public String idFasilitas;
    public int lamaPinjam;
    public LocalDate tanggalPinjam;
    public String status;
    
    public Peminjaman(String idTransaksi, String idPeminjam, String idFasilitas, int lamaPinjam) {
        this.idTransaksi = idTransaksi;
        this.idPeminjam = idPeminjam;
        this.idFasilitas = idFasilitas;
        this.lamaPinjam = lamaPinjam;
        this.tanggalPinjam = LocalDate.now();
        this.status = "Dipinjam";
    }
    
    public LocalDate getTanggalHarusKembali() {
        return tanggalPinjam.plusDays(lamaPinjam);
    }
}
