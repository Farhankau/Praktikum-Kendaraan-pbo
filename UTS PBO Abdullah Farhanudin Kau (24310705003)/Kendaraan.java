/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Kau
 */
public class Kendaraan {
    // Atribut (data) dengan enkapsulasi
    private String nomorPlat;
    private String merk;
    private int tahunProduksi;

    // Konstruktor untuk mengisi data awal
    public Kendaraan(String nomorPlat, String merk, int tahunProduksi) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Getter dan Setter
    public String getNomorPlat() {
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("--- Informasi Kendaraan ---");
        System.out.println("Nomor Plat       : " + nomorPlat);
        System.out.println("Merk             : " + merk);
        System.out.println("Tahun Produksi   : " + tahunProduksi);
    }
}
  
