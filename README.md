# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Proyek ini adalah sebuah sistem manajemen sederhana untuk mengelola data pasien dan dokter di sebuah rumah sakit.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Orang`, `Pasien`, `Dokter`, dan `RumahSakit` adalah contoh dari class.

```bash
public class Orang {
    ...
}

public class Pasien extends Orang {
    ...
}

public class Dokter extends Orang {
    ...
}

public class RumahSakit {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Pasien[] penderita = new Pasien[3];` dan `Dokter[] doktor = new Dokter[2];` adalah contoh pembuatan object, angka `[3]` dan `[2]` merupakan bentuk jumlah Object yang ingin dibuat.

```bash
Pasien[] penderita = new Pasien[3];

Dokter[] doktor = new Dokter[2];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `umur`, `Idpasien`, dan `spesialis` adalah contoh atribut.

```bash
String nama;
int umur;
String Idpasien;
String spesialis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Orang`, `Pasien` dan `Dokter`.

```bash
public Orang(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
}

public Pasien(String nama, int umur, String Idpasien) {
    super(nama, umur);
    this.Idpasien = Idpasien;
}

public Dokter(String nama, int umur, String spesialis) {
    super(nama, umur);
    this.spesialis = spesialis;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setUmur`, `setIdPasien`, dan `setSpesialis` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(int umur) {
    this.umur = umur;
}

public void setIdPasien(String Idpasien) {
    this.Idpasien = Idpasien;
}

public void setSpesialis(String spesialis) {
    this.spesialis = spesialis;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getUmur`, `getIdPasien`, dan `getSpesialis` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getUmur() {
    return umur;
}

public String getIdPasien() {
    return Idpasien;
}

public String getSpesialis() {
    return spesialis;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `umur`, `idpasien`, dan `spesialis` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int umur;
private String Idpasien;
private String spesialis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Pasien` mewarisi `Orang` dengan sintaks `extends`.

```bash
public class Pasien extends Orang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `Pasien` dan `Dokter` mengoverride metode `tampilHasil` dari kelas `Orang`.

```bash
@Override
public void tampilHasil() {
    super.tampilHasil();
    System.out.println("ID Pasien: " + Idpasien);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, seleksi digunakan untuk memfilter `pasien` berdasarkan `umur`.

```bash
if (pasien.getUmur() > filterUmur) {
    pasien.tampilHasil();
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data `pasien` dan `dokter`.

```bash
for (int i = 0; i < penderita.length; i++) {
    // Kode untuk menginput data pasien
}

for (int i = 0; i < doktor.length; i++) {
    // Kode untuk menginput data dokter
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Nama: ");
String nama = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Pasien[] penderita = new Pasien[3];` adalah contoh penggunaan array.

```bash
Pasien[] penderita = new Pasien[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani kesalahan input umur.

```bash
boolean validInput = false;
while (!validInput) {
    try {
        umur = Integer.parseInt(scanner.nextLine());
        validInput = true;
    } catch (NumberFormatException e) {
        System.out.println("Error: Harap masukkan angka untuk umur.");
    }
}
```

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
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ferdhyan Dwi Rangga Saputra
NPM: 2210010171
