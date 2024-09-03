/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm2;

/**
 *
 * @author zahidahhanumalzahra
 */
class NonFiksi extends Novel {

    
    NonFiksi(String judul, String penulis) {
        super(judul, penulis); // Menggunakan super untuk memanggil konstruktor superclass
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari superclass
        System.out.println("Kategori: Non-Fiksi");
    }
}
