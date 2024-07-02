package pbouas;

// Class and Encapsulation and Inheritance
public class Pasien extends Orang {
    private String Idpasien;

    // Constructor
    public Pasien(String nama, int umur, String Idpasien) {
        super(nama, umur);
        this.Idpasien = Idpasien;
    }

    // Accessor (Getter)
    public String getIdPasien() {
        return Idpasien;
    }

    // Mutator (Setter)
    public void setIdPasien(String Idpasien) {
        this.Idpasien = Idpasien;
    }

    // Polymorphism (overriding)
    @Override
    public void tampilHasil() {
        super.tampilHasil();
        System.out.println("ID Pasien: " + Idpasien);
    }
}
