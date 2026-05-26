/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author WINDOWS 11
 */

public class Orang {
    protected String nama;
    protected int umur;
    protected String alamat;

    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method Overloading
    public void tampilData() {
        System.out.println("Data Orang");
    }
    public void tampilData(String nama) {
        System.out.println("Nama : " + nama);
    }

    // Getter Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
  
    @Override
    public String toString() {
        return nama + " | " + umur + " | " + alamat;
    }
}
