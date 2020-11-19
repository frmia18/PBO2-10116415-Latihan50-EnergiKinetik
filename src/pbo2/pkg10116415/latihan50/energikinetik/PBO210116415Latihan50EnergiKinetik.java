/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan50.energikinetik;

/**
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 *Deskripsi Program : program ini berisi program menghitung energi kinerik dalam
 *                    keadaan bergerak dan keadaan diam
 */
public class PBO210116415Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           EnergiKinetik ek = new EnergiKinetik();
        
        System.out.println("===Program Menghitung Energi Kinetik===");
        System.out.println("Massa benda = 145" + "g");
        ek.setMassa(145);
        System.out.println("Kecepatan benda = 25" + "m/s");
        ek.setKecepatan(25);
        System.out.println("");
        System.out.println("Energi kinetiknya adalah " + ek.energiKinetik(145, 25));
        System.out.println("Usaha yang dilakukan dalam keadaan diam adalah "
        + ek.ekDiam(0.5*145*25*25));
    }
    
}
