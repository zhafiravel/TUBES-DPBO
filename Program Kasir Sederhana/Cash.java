/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Dimastian
 */
public class Cash implements Pembayaran {
    @Override
    public void prosesBayar() {
        System.out.println("Pembayaran dengan uang tunai berhasil diproses.");
    }
}
