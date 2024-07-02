package pbouas;

// Class and Encapsulation and Inheritance
public class Dokter extends Orang {
    private String spesialis;

    // Constructor
    public Dokter(String nama, int umur, String spesialis) {
        super(nama, umur);
        this.spesialis = spesialis;
    }

    // Accessor (Getter)
    public String getSpesialis() {
        return spesialis;
    }

    // Mutator (Setter)
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    // Polymorphism (overriding)
    @Override
    public void tampilHasil() {
        super.tampilHasil();
        System.out.println("Spesialis: " + spesialis);
    }
}
