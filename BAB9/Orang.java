/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author WINDOWS 11
 */

public abstract class Orang {
    protected String nama;
    protected int umur;
    protected String alamat;

    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    // ABSTRACT METHODS
    public abstract boolean validasiData();
    public abstract void tampilInfoLengkap();
    public abstract String getKategori();
    
    // Method Overloading
    public void tampilData() {
        System.out.println("Data Orang");
    }
    public void tampilData(String nama) {
        System.out.println("Nama : " + nama);
    }
    public boolean isDewasa() {
        return umur >= 17;
    }
    public void tampilDataDasar() {
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
    }

    // Getter Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }
    public String getAlamat() { return alamat;   }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    @Override
    public String toString() {
        return nama + " | " + umur + " | " + alamat;
    }
}