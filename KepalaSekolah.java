/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm2;

/**
 *
 * @author zahidahhanumalzahra
 */
public class KepalaSekolah {
    private String nama;
    private int umur;
   
    public void melakukanEvaluasi() {
        System.out.println("Kepala Sekolah melakukan evaluasi");
    }
    
    public void menilai() {
        System.out.println("Kepala Sekolah memberikan penilaian");   
    }
    
    public void sekolah() {
        System.out.println("Kepala Sekolah bekerja di sekolah");   
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void melakukanKonsultasi() {
        System.out.println("Guru memberikan konsultasi prestasi");
    }
    
    public void memberikanNilai() {
        System.out.println("Guru memberikan nilai tambahan.");
    }
}
