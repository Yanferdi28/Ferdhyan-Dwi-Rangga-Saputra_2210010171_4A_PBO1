package pbouas;
import java.util.Scanner;

public class RumahSakit {
    public static void main(String[] args) {
        // Array dari Pasien
        try (Scanner scanner = new Scanner(System.in)) {
            // Array dari Pasien
            Pasien[] penderita = new Pasien[3];
            for (int i = 0; i < penderita.length; i++) {
                System.out.println("Masukkan Keterangan Pasien " + (i + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                int umur = 0;
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Umur: ");
                    try {
                        umur = Integer.parseInt(scanner.nextLine());
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Harap masukkan angka untuk umur.");
                    }
                }
                System.out.print("ID Pasien: ");
                String Idpasien = scanner.nextLine();
                penderita[i] = new Pasien(nama, umur, Idpasien);
            }

            // Array dari Dokter
            Dokter[] doktor = new Dokter[2];
            for (int i = 0; i < doktor.length; i++) {
                System.out.println("Masukkan Keterangan Dokter " + (i + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                int umur = 0;
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Umur: ");
                    try {
                        umur = Integer.parseInt(scanner.nextLine());
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Harap masukkan angka untuk umur.");
                    }
                }
                System.out.print("Spesialis: ");
                String spesialis = scanner.nextLine();
                doktor[i] = new Dokter(nama, umur, spesialis);
            }

            // Menampilkan Informasi Menggunakan Polymorphism
            System.out.println("\nInformasi Pasien:");
            for (Pasien pasien : penderita) {
                pasien.tampilHasil();
            }

            System.out.println("\nInformasi Dokter:");
            for (Dokter dokter : doktor) {
                dokter.tampilHasil();
            }

            // Selection
            int filterUmur = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nMasukkan Umur Untuk Memilah Pasien: ");
                try {
                    filterUmur = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Harap masukkan angka untuk umur.");
                }
            }
            System.out.println("Pasien Yang Berusia Lebih Dari " + filterUmur + ":");
            for (Pasien pasien : penderita) {
                if (pasien.getUmur() > filterUmur) {
                    pasien.tampilHasil();
                }
            }

            // Looping
            System.out.println("\nMengulangi Semua Data Pasien?");
            System.out.print("Apakah Anda Ingin Mengulangi Semua Data Pasien? (ya/tidak): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("ya")) {
                System.out.println("\nMengulangi Semua Data Pasien:");
                for (int i = 0; i < penderita.length; i++) {
                    System.out.println("Pasien " + (i + 1) + ":");
                    penderita[i].tampilHasil();
                }
            } else {
                System.out.println("Mengulangi Semua Data Pasien Dibatalkan.");
            }

            // Looping Dengan Pilihan Untuk Dokter
            System.out.println("\nMengulangi Semua Data Dokter?");
            System.out.print("Apakah Anda Ingin Mengulangi Semua Data Dokter? (ya/tidak): ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("ya")) {
                System.out.println("\nMengulangi Semua Data Dokter:");
                for (int i = 0; i < doktor.length; i++) {
                    System.out.println("Dokter " + (i + 1) + ":");
                    doktor[i].tampilHasil();
                }
            } else {
                System.out.println("Mengulangi Semua Data Dokter Dibatalkan.");
            }

            // Simple IO
            int numPasien = 0;
            validInput = false;
            while (!validInput) {
                System.out.print("\nMasukkan Jumlah Pasien Yang Akan Ditambahkan: ");
                try {
                    numPasien = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Harap masukkan angka untuk jumlah pasien.");
                }
            }

            for (int i = 0; i < numPasien; i++) {
                System.out.println("Masukkan Detail Untuk Pasien Baru " + (i + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                int umur = 0;
                validInput = false;
                while (!validInput) {
                    System.out.print("Umur: ");
                    try {
                        umur = Integer.parseInt(scanner.nextLine());
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Harap masukkan angka untuk umur.");
                    }
                }
                System.out.print("ID Pasien: ");
                String Idpasien = scanner.nextLine();
                Pasien newPasien = new Pasien(nama, umur, Idpasien);
                newPasien.tampilHasil();
            }
        }
    }
}
