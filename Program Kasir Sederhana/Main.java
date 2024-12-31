/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Dimastian
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat Menu
        Menu menu = new Menu();
        menu.tambahItem(new Makanan("Nasi Goreng", 25000));      // Nomor 1
        menu.tambahItem(new Makanan("Ayam Goreng", 20000));     // Nomor 2
        menu.tambahItem(new Makanan("Ayam Geprek", 22000));     // Nomor 3
        menu.tambahItem(new Makanan("Mie Goreng", 18000));      // Nomor 4
        menu.tambahItem(new Minuman("Es Teh Manis", 5000));     // Nomor 5
        menu.tambahItem(new Minuman("Jus Alpukat", 15000));     // Nomor 6

        System.out.println("====== Menu ======");
        System.out.println("1. Nasi Goreng - Rp 25,000");
        System.out.println("2. Ayam Goreng - Rp 20,000");
        System.out.println("3. Ayam Geprek - Rp 22,000");
        System.out.println("4. Mie Goreng  - Rp 18,000");
        System.out.println("5. Es Teh Manis - Rp 5,000");
        System.out.println("6. Jus Alpukat  - Rp 15,000");

        // Pesanan Pelanggan
        Pesanan pesanan = new Pesanan(10, 5); // Diskon 10%, Pajak 5%
        boolean selesaiMemesan = false;

        while (!selesaiMemesan) {
            System.out.println("\nPilih nomor menu untuk ditambahkan ke pesanan (atau ketik 0 untuk selesai):");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    pesanan.tambahItem(new Makanan("Nasi Goreng", 25000));
                    break;
                case 2:
                    pesanan.tambahItem(new Makanan("Ayam Goreng", 20000));
                    break;
                case 3:
                    pesanan.tambahItem(new Makanan("Ayam Geprek", 22000));
                    break;
                case 4:
                    pesanan.tambahItem(new Makanan("Mie Goreng", 18000));
                    break;
                case 5:
                    pesanan.tambahItem(new Minuman("Es Teh Manis", 5000));
                    break;
                case 6:
                    pesanan.tambahItem(new Minuman("Jus Alpukat", 15000));
                    break;
                case 0:
                    selesaiMemesan = true;
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        }

        // Cetak Struk
        pesanan.cetakStruk();

        // Pilih Pembayaran
        System.out.println("\nPilih metode pembayaran: ");
        System.out.println("1. QRIS");
        System.out.println("2. Cash");
        int metode = input.nextInt();

        switch (metode) {
            case 1:
                Pembayaran qris = new Qris("BCA");
                qris.prosesBayar();
                break;
            case 2:
                Pembayaran cash = new Cash();
                cash.prosesBayar();
                break;
            default:
                System.out.println("Metode pembayaran tidak valid.");
        }

        input.close();
    }
}

