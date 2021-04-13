/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Tugas3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int pBalok, lBalok, tBalok;
        double jKerucut, tKerucut;
        char pilih,ulang;
        
        do{
        System.out.println("-----------------------------");
        System.out.println("Menu");
        System.out.println("1.Balok");
        System.out.println("2.Kerucut");
        System.out.print("Pilih : ");
        pilih = scanner.next().charAt(0);
        System.out.println("-----------------------------");
        
        switch(pilih){
                case '1':
                    scanner = new Scanner (System.in);
                    System.out.print("Input Panjang : ");
                    pBalok = scanner.nextInt();
                    System.out.print("Input Lebar   : ");
                    lBalok = scanner.nextInt();
                    System.out.print("Input Tinggi  : ");
                    tBalok = scanner.nextInt();
                    
                    PersegiPanjang bidang = new PersegiPanjang(pBalok,lBalok);
                    Balok ruang = new Balok(pBalok, lBalok, tBalok);
                    
                    System.out.println("--------------------------------");
                    System.out.println("Luas Persegi Panjang     : " + bidang.luasPersegiPanjang());
                    System.out.println("Keliling Persegi Panjang : " + bidang.kelilingPersegiPanjang());
                    System.out.println("Luas Permukaan Balok : "+ ruang.luasPermukaanBalok());
                    System.out.println("Volume Balok         : "+ ruang.volumeBalok());
                    break;
                
                case '2':
                    scanner = new Scanner (System.in);
                    System.out.print("Input Jari-Jari : ");
                    jKerucut = scanner.nextDouble();
                    System.out.print("Input Tinggi    : ");
                    tKerucut = scanner.nextDouble();
                    
                    Kerucut hasilKerucut = new Kerucut(jKerucut, tKerucut);
                    
                    System.out.println("--------------------------------");
                    System.out.println("Luas Lingkaran     : " + hasilKerucut.luasLingkaran(jKerucut));
                    System.out.println("Keliling Lingkaran : " + hasilKerucut.kelilingLingkaran(jKerucut));
                    System.out.println("Luas Permukaan Kerucut : " + hasilKerucut.luasPermukaanKerucut());
                    System.out.println("Volume Kerucut         : " + hasilKerucut.volumeKerucut());
                    break;
        }
        
        System.out.println("--------------------------------");
        System.out.print("Back to Menu (y/n): ");
        ulang = scanner.next().charAt(0);
        System.out.println("-----------------------------");
        ulang = Character.toUpperCase(ulang);
        }while (ulang == 'Y');
    }
}
