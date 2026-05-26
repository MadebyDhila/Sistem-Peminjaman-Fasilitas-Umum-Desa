/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author WINDOWS 11
 */

public class Jenis extends Fasilitas {
    private String jenis;
    public Jenis(String nama, int jumlah, String kondisi, String jenis) {
        super(nama, jumlah, kondisi);
        this.jenis = jenis;
    }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    @Override
    public String toString() {
        return nama + " | " + jumlah + " | " + kondisi + " | " + jenis;
    }
}
