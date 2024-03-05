/*
NIM     : 13020220094
Nama    : Fidly Saputra Awal
*/

import javax.swing.*;

public class JOptionPane1 {
    public static void main(String[] args) {
        //input
        String nim = JOptionPane.showInputDialog("Nim     : ");
        String nama = JOptionPane.showInputDialog("Nama      : ");
        String jurusan = JOptionPane.showInputDialog("Jurusan      : ");
        String fakultas = JOptionPane.showInputDialog("Fakultas : ");

        // Output
        System.out.println("===============================");
        System.out.println("Data mahasiswa yang dimasukkan: ");
        System.out.println("===============================");
        System.out.println("Nim      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Fakultas : " + fakultas);
    }
}