/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo.tm2;

/**
 *
 * @author zahidahhanumalzahra
 */
public class Utama {
    public static void main(String[] args) {
        Siswa siswa = new Siswa(); // Constructor
        System.out.println("Nama siswa: " + siswa.getNama());
        System.out.println("Umur siswa: " + siswa.getUmur());
        System.out.println("Mata pelajaran siswa: " + siswa.getMataPelajaran());
        System.out.println("");
        
        Guru guru = new Guru(); // Constructor
        System.out.println("Nama guru: " + guru.getNama());
        System.out.println("Umur guru: " + guru.getUmur());
        System.out.println("Guru mengajar di " + guru.getSekolah());
        System.out.println("berikut super dan this :");
        guru.cek();
        System.out.println("");
       
        KepalaSekolah kepalaSekolah = (KepalaSekolah) siswa; // Casting 
        kepalaSekolah.melakukanEvaluasi();
        
        KepalaSekolah worker = new KepalaSekolah();
        worker.menilai();
        worker.melakukanEvaluasi();
        System.out.println("");  
    }
}
