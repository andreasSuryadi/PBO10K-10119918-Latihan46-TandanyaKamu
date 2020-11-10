/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan46tandanyakamu;

/**
 *
 * @author andreas
 */
public class Age {
    private int yearBirth, yearNow;
    private String red = "\u001b[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String keterangan = "";
        
        if (umur >= 0 && umur <= 5) {
            keterangan = "LAGI LUCU-LUCU NYA";
        } else if (umur > 5 && umur <= 10) {
            keterangan = "MASIH ANAK-ANAK";
        } else if (umur > 10 && umur <= 13) {
            keterangan = "MASIH REMADJA";
        } else if (umur > 13 && umur <= 19) {
            keterangan = "ALAY";
        } else if (umur > 19 && umur <= 29) {
            keterangan = "LAGI GALAU NYARI JODOH";
        } else if (umur > 29 && umur <= 35) {
            keterangan = "LAGI SIBUK NYARI UANG";
        } else if (umur > 35 && umur <= 150) {
            keterangan = "SUDAH TUA";
        } else {
            keterangan = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        
        return red + keterangan;
    }
}
