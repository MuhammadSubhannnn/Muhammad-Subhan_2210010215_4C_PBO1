package MenuRestaurant;


public class MenuRestaurant {
    private String nama;
    private double harga;
    private String kategori;

    // Constructor
    public MenuRestaurant(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga + ", Kategori: " + kategori;
    }
}
