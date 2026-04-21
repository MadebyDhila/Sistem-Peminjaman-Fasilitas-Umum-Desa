/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author WINDOWS 11
 */

public class Peminjam extends Orang {
    public String dusun;
    public String rt;
    public String rw;
    
    public Peminjam(String nama, int umur, String alamat, String dusun, String rt, String rw) {
        super(nama, umur, alamat);
        this.dusun = dusun;
        this.rt = rt;
        this.rw = rw;
    }
}
