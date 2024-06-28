# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi sederhana menu restaurant menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Program ini menerima input berupa menu makanan/minuman, menambahkan menu baru bersama harga, dan memberikan output berupa informasi detail dari menu restaurant. program ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep yang akan dijelaskan:

1. Class: Kelas MenuRestaurant dan Main mendefinisikan objek MenuRestaurant.
   public class MenuRestaurant {
   public class Main {
   
2. Objek: Objek MenuRestaurant diinisialisasi dalam kelas Main.
   
3. Atribut: Atribut nama, harga, dan kategori dalam kelas MenuRestaurant.
   public class MenuRestaurant {
    private String nama;
    private double harga;
    private String kategori;
   
4. Constructor: Constructor dalam kelas MenuRestaurant digunakan untuk menginisialisasi objek.
    public MenuRestaurant(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

5. Mutator: Method setter (setNama, setHarga, setKategori) digunakan untuk mengubah nilai atribut.
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
   
6. Accessor: Method getter (getNama, getHarga, getKategori) digunakan untuk mengambil nilai atribut.
   public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }
   
7. Encapsulation: Atribut dalam kelas MenuRestaurant dienkapsulasi menggunakan modifier private.
   public class MenuRestaurant {
    private String nama;
    private double harga;
    private String kategori;

8. Inheritance: Program ini tidak memanfaatkan inheritance secara eksplisit, namun dapat dengan mudah ditambahkan jika diperlukan.
    
9. Polymorphism: Program ini tidak memanfaatkan polymorphism secara eksplisit, namun dapat dengan mudah ditambahkan jika diperlukan.

10. Seleksi: Seleksi menggunakan if dalam menampilkan menu berdasarkan kategori.
    System.out.println("\nMasukkan kategori yang ingin dilihat (Makanan/Minuman): ");
            String kategori = scanner.nextLine();
            
            System.out.println("Menu dengan kategori " + kategori + ":");
            for (MenuRestaurant menu : menuList) {
                if (menu.getKategori().equalsIgnoreCase(kategori)) {
                    System.out.println(menu);
                }
            }
    
11. Perulangan: Perulangan menggunakan for untuk menampilkan daftar menu.
   System.out.println("Daftar Menu Restaurant:");
            for (MenuRestaurant menu : menuList) {
                System.out.println(menu);
            }

12. IO Sederhana: IO menggunakan Scanner untuk input dari pengguna.
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

    System.out.println("\nDaftar Menu Restaurant setelah penambahan:");
            for (MenuRestaurant menu : menuList) {
                System.out.println(menu);
            }
        }
    }
}

13. Array: Menggunakan ArrayList sebagai array dinamis untuk menyimpan daftar menu.
    public class Main {
    public static void main(String[] args) {
        ArrayList<MenuRestaurant> menuList = new ArrayList<>();

14. Error Handling dan Perbaikan
Untuk error handling, kita dapat menambahkan try-catch block pada bagian input pengguna untuk menghindari kesalahan input.
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

Pada Kelas MenuRestaurant
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


Pada Kelas Main
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
            
            // Perulangan menampilkan menu
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
            
            // IO sederhana menu baru
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
            
            // Menampilkan daftar menu setelah melakukan penambahan
            System.out.println("\nDaftar Menu Restaurant setelah penambahan:");
            for (MenuRestaurant menu : menuList) {
                System.out.println(menu);
            }
        }
    }
}


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    -    |
|  9  | Polymorphism   |    -    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **85** |

## Pembuat

Nama  : Muhammad Subhan
NPM   : 2210010215
Kelas : 4C Reguler Pagi
