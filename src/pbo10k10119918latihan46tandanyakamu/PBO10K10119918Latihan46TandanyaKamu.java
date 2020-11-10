/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan46tandanyakamu;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil cetak keterangan berdasarkan data umur
 *
 */

public class PBO10K10119918Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        
        Age age = new Age(date.getYear() + 1900);
        
        int yearBirth;
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        yearBirth = scanner.nextInt();
        
        age.setYearBirth(yearBirth);
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
