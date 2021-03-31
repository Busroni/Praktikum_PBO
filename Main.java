/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import datamahasiswa.DataMahasiswa;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        String nama,nim;
        int usia,uts,uas;
        char pilih, ulang;
        
        System.out.print("Input Nama : ");
        nama = scanner.nextLine();
        System.out.print("Input NIM : ");
        nim = scanner.next();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Input Nilai UTS : ");
        uts = scanner.nextInt();
        System.out.print("Input Nilai UAS : ");
        uas = scanner.nextInt();
        
        DataMahasiswa mahasiswa = new DataMahasiswa(nama, nim, usia, uts, uas);
        
        do{
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1.Lihat Detail Data");
            System.out.println("2.Edit Data");
            System.out.print("Pilih : ");
            pilih = scanner.next().charAt(0);
            
            switch(pilih){
                case '1':
                    mahasiswa.detail();
                    break;
                
                case '2':
                    scanner = new Scanner (System.in);
                    System.out.print("Input Nama : ");
                    mahasiswa.nama = scanner.nextLine();
                    System.out.print("Input NIM : ");
                    mahasiswa.nim = scanner.next();
                    System.out.print("Input Usia : ");
                    mahasiswa.usia = scanner.nextInt();
                    System.out.print("Input Nilai UTS : ");
                    mahasiswa.uts = scanner.nextInt();
                    System.out.print("Input Nilai UAS : ");
                    mahasiswa.uas = scanner.nextInt();
                    break; 

            }
            System.out.println("-----------------------------");
            System.out.print("Back to Menu (y/n): ");
            ulang = scanner.next().charAt(0);
            System.out.println("-----------------------------");
            ulang = Character.toUpperCase(ulang);
        }while (ulang == 'Y');
    }    
}
