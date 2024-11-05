/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arraylist.tugasarraylist;
import java.util.ArrayList;
/**
 *
 * @author meryl
 */
public class inputDataMahasiswaa {
ArrayList<Mahasiswa> listmahasiswa;
    
    /**
     *
     */
    public inputDataMahasiswaa(){
    listmahasiswa = new ArrayList();
}
    public void insertData(String NIM, String Nama, String Alamat, String mataKuliah){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, mataKuliah);
        listmahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa>getALL(){
        return listmahasiswa;
    }
    
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
