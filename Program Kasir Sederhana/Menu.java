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

public class Menu {
    private ArrayList<Item> listItem;

    public Menu() {
        listItem = new ArrayList<>();
    }

    public void tambahItem(Item item) {
        listItem.add(item);
    }

    public void tampilkanMenu() {
        for (Item item : listItem) {
            System.out.println(item.getInformasi());
        }
    }
}

