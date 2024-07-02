package MenuRestaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuRestaurant> menuList = new ArrayList<>();
        // Menambahkan menu ke daftar menu
        try (Scanner scanner = new Scanner(System.in)) {
            // Menambahkan menu ke daftar menu
            menuList.add(new MenuRestaurant("Nasi Goreng", 20000, "Makanan"));
            menuList.add(new MenuRestaurant("Es Teh", 5000, "Minuman"));
            menuList.add(new MenuRestaurant("Mie Ayam", 15000, "Makanan"));
            
            // Perulangan untuk menampilkan menu
            System.out.println("Daftar Menu Restaurant:");
            for (MenuRestaurant menu : menuList) {
                System.out.println(menu);
            }
            
            // Seleksi berdasarkan kategori
            System.out.println("\nMasukkan kategori yang ingin dilihat (Makanan/Minuman): ");
            String kategori = scanner.nextLine();
            
            System.out.println("Menu dengan kategori " + kategori + ":");
            for (MenuRestaurant menu : menuList) {
                if (menu.getKategori().equalsIgnoreCase(kategori)) {
                    System.out.println(menu);
                }
            }
            
            // IO sederhana untuk menambahkan menu baru
            System.out.println("\nTambahkan menu baru:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();
            scanner.nextLine();  // Membersihkan buffer
            System.out.print("Kategori: ");
            kategori = scanner.nextLine();
            
            menuList.add(new MenuRestaurant(nama, harga, kategori));
            System.out.println("Menu berhasil ditambahkan!");
            
            // Menampilkan daftar menu setelah penambahan
            System.out.println("\nDaftar Menu Restaurant setelah penambahan:");
            for (MenuRestaurant menu : menuList) {
                System.out.println(menu);
            }
        }
    }
}
