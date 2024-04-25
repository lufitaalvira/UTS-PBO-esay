import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Tambahkan buku");
            System.out.println("2. Tampilkan semua buku");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan tahun penerbitan: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Book newBook = new Book(title, author, year);
                    library.addBook(newBook);
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.println("Keluar dari Sistem Manajemen Perpustakaan. Selamat tinggal!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
 