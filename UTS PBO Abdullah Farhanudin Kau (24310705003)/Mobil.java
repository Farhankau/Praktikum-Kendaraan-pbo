/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Kau
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;
    
    public Mobil(String nomorPlat, String merk, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(nomorPlat, merk, tahunProduksi); // panggil konstruktor induk
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }
    
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // panggil versi induk
        System.out.println("Jumlah Pintu     : " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}

