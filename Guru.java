/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm2;

/**
 *
 * @author zahidahhanumalzahra
 */
public class Guru extends KepalaSekolah implements Konsultasi, Penilaian {
    private String sekolah;
    
    public Guru() {
        System.out.println("ini constructor Guru");
    }
    
    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }
    
    public String getSekolah() {
        return sekolah;
    }

    @Override
    public void melakukanKonsultasi() {
        System.out.println("Guru memberikan konsultasi akademik kepada siswa.");
    }
    
    public void memberikanNilai() {
        System.out.println("Guru memberikan nilai kepada siswa.");
    }
    
    public void cek() {
        super.melakukanKonsultasi();
        this.melakukanKonsultasi();
        super.memberikanNilai();
        this.memberikanNilai();
    }     
}    
