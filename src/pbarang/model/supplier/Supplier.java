package pbarang.model.supplier;

public class Supplier {
    
    private Long id;
    private String namaSupplier;
    private String alamat;
    private String telepon;

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

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", namaSupplier=" + namaSupplier + ", alamat=" + alamat + ", telepon=" + telepon + '}';
    }

}
