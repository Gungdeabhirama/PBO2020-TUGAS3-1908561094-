package com.main;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int insertMenu;
        do {
            insertMenu = this.getIntegerInput("\n\nNama: I Gusti Agung Gde Abhirama Adnyana\nNIM: 1908561094\nMenu\n1.Tampilkan Daftar Isi Gitar\n2.Masukan Data Gitar\n3. Hapus Daftar Gitar\n4. Keluar\nPilihan: ");
            this.processMenu(insertMenu);
        } while(insertMenu != 4);
    }

    private void processMenu(int pilihan) {
        switch (pilihan) {

            case 1:

                com.main.JenisGitar jenisGitar = com.main.TampilanGitar.TampilanGitar();
                if (jenisGitar != null) {
                    System.out.println("Data Gitar Yang Tersedia : " + jenisGitar.getJenisGitar());
                }
                else {
                    System.out.println("Belum Terdapat Gitar, Silahkan Masukan Jenis Gitar Anda Di Menu 1");
                }

                break;

            case 2:

                com.main.SimpanGitar simpanMasukan = new com.main.SimpanGitar(getPesanInput("Masukkan Code gitar: "));
                simpanMasukan.Jalankan();

                break;

            case 3:

                com.main.SimpanGitar simpanMasukan1 = new com.main.SimpanGitar(null);
                simpanMasukan1.Jalankan();

                break;

            case 4:
                 System.out.println("Terima Kasih");
                break;

            default:
                System.out.println("Mohon Maaf Inputan Anda Salah");

                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getPesanInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
