/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm2;

/**
 *
 * @author zahidahhanumalzahra
 */
public class Siswa extends KepalaSekolah {
    private String mataPelajaran;
    
    public Siswa() {
        System.out.println("ini constructor Siswa");
        super.melakukanEvaluasi();
        super.menilai();
        super.setNama("Budi");
        super.setUmur(18);
        this.setMataPelajaran("Matematika");
    }
    
    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }
    
    public String getMataPelajaran() {
        return mataPelajaran;
    }
}
