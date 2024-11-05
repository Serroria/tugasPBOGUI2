/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.tugasarraylist;

/**
 *
 * @author meryl
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, mataKuliah;

    
    public Mahasiswa(String NIM, String Nama, String Alamat, String mataKuliah){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.mataKuliah = mataKuliah;
    }
     public String getmataKuliah(){
        return mataKuliah;
    }
    public String getAlamat(){
        return Alamat;
    }
    public String getNIM(){
        return NIM;
    }
    public String getNama(){
        return Nama;
    }
    
}
