/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

import BAB3.*;

/**
 *
 * @author WINDOWS 11
 */

public class Fasilitas {
    protected String nama;
    protected int jumlah;
    protected String kondisi;  
    
    public Fasilitas(String nama, int jumlah, String kondisi) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
    }
    
    // Getter (enkapsulasi)
    public String getNama() { return nama; }
    public int getJumlah() { return jumlah; }
    public String getKondisi() { return kondisi; }
    
    // Setter (enkapsulasi)
    public void setNama(String nama) { this.nama = nama; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }
}
