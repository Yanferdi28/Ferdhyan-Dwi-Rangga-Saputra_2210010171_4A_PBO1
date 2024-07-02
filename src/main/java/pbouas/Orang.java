package pbouas;

// Class and Encapsulation
public class Orang {
    private String nama;
    private int umur;

    // Constructor
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Polymorphism
    public void tampilHasil() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}
