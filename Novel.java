/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm2;

/**
 *
 * @author zahidahhanumalzahra
 */
// Interface
interface Buku {
    void tampilkanInfo();
}

// Superclass 1
class Novel implements Buku {
    String judul;
    String penulis;

    // Constructor
    Novel(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}