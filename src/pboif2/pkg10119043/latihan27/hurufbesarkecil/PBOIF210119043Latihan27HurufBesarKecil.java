/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program merubah huruf besar dan kecil
 */
public class PBOIF210119043Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static String inputUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukan Kalimat : ");
        String kalimat = scanner.nextLine();
        return kalimat;
    }
    
    public static void formatKalimat(String kalimat) {
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
        System.out.println("\n====Hasil Formating=====");
        System.out.println("Huruf besar : " + hurufBesar);
        System.out.println("Huruf kecil : " + hurufKecil);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        formatKalimat(inputUser());
    }
    
}
