/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;


/**
 *
 * @author acer
 */
public class DataMahasiswa {
    String nama,nim;
    int usia,uts,uas,hasil;
    
    public DataMahasiswa(String nama, String nim,int usia,int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
}
    
    String jurusan(){
        String jurusan;
        switch (nim.charAt(2)){
            case '1':
                jurusan = "Teknik Kimia";
                break;
            case '2':
                jurusan = "Teknik Industri";
                break;
            case '3':
                jurusan = "Informatika";
                break;
            case '4':
                jurusan = "Sistem Informasi";
                break;
            default :
                jurusan = "Jurusan tidak ditemukan";
        }
        return jurusan;
    }
    
    double nilaiAkhir(){
        int hasil = (uts+uas)/2;
        return (hasil);
    }
    
    void detail(){
        System.out.println("-----------------------------");
        System.out.println("Nama : "+ nama);
        System.out.println("Nim : "+ nim);
        System.out.println("Usia : "+ usia);
        System.out.println("Jurusan : "+ jurusan());
        System.out.println("Nilai : "+ nilaiAkhir());
    }
}