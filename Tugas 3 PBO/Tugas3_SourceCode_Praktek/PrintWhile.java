/*
NIM              : 13020220094
Nama             : Fidly Saputra Awal
Hari/Tanggal     : Rabu 13/03/2024
Waktu Pengerjaan : 08:00
*/

import java.util.Scanner;

public class PrintWhile {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        
        System.out.print ("Nilai N >0 = "); 
        N = masukan.nextInt();
        i = 1; 
        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N){ System.out.println (i); 
            i++; 
        }; 
    }
}