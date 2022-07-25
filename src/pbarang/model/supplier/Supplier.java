package pbarang.model.supplier;

public class Supplier {
    
    private Long id;
    private String namaSupplier;
    private String alamat;
    private int telepon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", namaSupplier=" + namaSupplier + ", alamat=" + alamat + ", telepon=" + telepon + '}';
    }

}
