/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpborestoran;

/**
 *
 * @author Vincent
 */
public class OrderItem {
    public int id;
    public String nama;
    public int harga;
    public String kategori;
    public int jumlah;

    public OrderItem(int id, String nama, int harga, String kategori, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
        this.jumlah = jumlah;
    }
}
