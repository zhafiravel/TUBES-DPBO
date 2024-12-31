/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Dimastian
 */
public class Qris implements Pembayaran {
    private String namaBank;

    public Qris(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesBayar() {
        System.out.println("Pembayaran melalui QRIS bank: " + namaBank + " berhasil diproses.");
    }

    public void tampilkanBarcode() {
        System.out.println("Menampilkan barcode untuk pembayaran melalui bank " + namaBank);
    }

    public void scanBarcode() {
        System.out.println("Barcode berhasil dipindai.");
    }
}
