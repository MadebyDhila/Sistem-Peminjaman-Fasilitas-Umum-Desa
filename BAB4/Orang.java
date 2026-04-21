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

public class Orang {
    protected String nama;
    protected int umur;
    protected String alamat;
    
    public Orang (String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    // Getter (enkapsulasi)
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getAlamat() { return alamat; }
    
    // Setter (enkapsulasi)
    public void setNama(String nama) { this.nama = nama; }
    public void setUmur(int umur) { this.umur = umur; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
}
