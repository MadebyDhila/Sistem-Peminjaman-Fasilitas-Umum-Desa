/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author WINDOWS 11
 */

public class Peminjam extends Orang {
    private String dusun;
    private String rt;
    private String rw;

    public Peminjam(String nama, int umur, String alamat,String dusun, String rt, String rw) {
        super(nama, umur, alamat);
        this.dusun = dusun;
        this.rt = rt;
        this.rw = rw;
    }

    // Getter Setter
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
