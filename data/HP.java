package data;

public class HP extends Laptop {

    public HP(String nama, String brand, String nProcessor, String jcProcessor, String so, String ram, String jStorage,
            String stok, String storage) {
        super(nama, brand, nProcessor, jcProcessor, so, ram, jStorage, stok);
        this.storage = storage;
    }

    int harga = 0;

    public int getHarga() {
        return harga = 18_000_000;
    }

    public String toString() {
        storage();
        return "\nNama                   : " + nama + "\n" +
                "Brand                  : " + brand + "\n" +
                "Nama Processor         : " + nProcessor + "\n" +
                "Jumlah Core Processor  : " + jcProcessor + "\n" +
                "Sistem Operasi         : " + so + "\n" +
                "RAM                    : " + ram + "\n" +
                "Jumlah Storage         : " + jStorage + "\n" +
                "Stok                   : " + stok + "\n" +
                "Harga                  : " + getHarga() + "\n" +
                "Storage Type           : " + storage + "\n" +
                "Storefront Position    : " + ket;
    }
}
