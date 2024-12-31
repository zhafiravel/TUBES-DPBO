/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Dimastian
 */
import java.util.ArrayList;

public class Pesanan {
    private ArrayList<Item> listItem;
    private double totalHarga;
    private double diskon;
    private double pajak;

    public Pesanan(double diskon, double pajak) {
        listItem = new ArrayList<>();
        this.diskon = diskon;
        this.pajak = pajak;
    }

    public void tambahItem(Item item) {
        listItem.add(item);
        System.out.println(item.getInformasi() + " berhasil ditambahkan ke pesanan.");
    }

    public double hitungTotalHarga() {
        totalHarga = 0;
        for (Item item : listItem) {
            totalHarga += item.getHarga();
        }
        totalHarga = totalHarga - (totalHarga * diskon / 100) + (totalHarga * pajak / 100);
        return totalHarga;
    }

    public void cetakStruk() {
        System.out.println("======= Struk Pesanan =======");
        for (Item item : listItem) {
            System.out.println(item.getInformasi());
        }
        System.out.println("Total Harga: " + hitungTotalHarga());
        System.out.println("==============================");
    }
}

