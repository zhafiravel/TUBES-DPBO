/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Dimastian
 */
public class Minuman implements Item {
    private String nama;
    private double harga;

    public Minuman(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public String getInformasi() {
        return "Minuman: " + nama + ", Harga: " + harga;
    }

    @Override
    public void tambahKePesanan() {
        System.out.println(nama + " ditambahkan ke pesanan.");
    }
}
