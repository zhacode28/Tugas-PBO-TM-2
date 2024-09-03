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
        
        Novel novelRomance = new Romance("Hujan", "Tere Liye");
        Novel novelAction = new Action("Negeri Para Bedebah", "Tere Liye");
        Novel novelSejarah = new Sejarah("Hitam", "Henry Manampiring ");

       
        Buku buku1 = novelRomance;
        Buku buku2 = novelAction;
        Buku buku3 = novelSejarah;

        buku1.tampilkanInfo();
        System.out.println();
        buku2.tampilkanInfo();
        System.out.println();
        buku3.tampilkanInfo();
    }
}