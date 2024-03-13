/*
NIM              : 13020220094
Nama             : Fidly Saputra Awal
Hari/Tanggal     : Rabu 13/03/2024
Waktu Pengerjaan : 08:10
*/

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a;
        
        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if(a >= 0) System.out.println("Nilai a positif " + a);
    }
}