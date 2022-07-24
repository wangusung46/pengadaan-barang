package pbarang.model.supplier;

public class DataSupplier {
    
    private int id_supplier;
    private String nama_supplier;
    private String alamat_supplier;
    private int telepon;

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama_supplier() {
        return nama_supplier;
    }

    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    public String getAlamat_supplier() {
        return alamat_supplier;
    }

    public void setAlamat_supplier(String alamat_supplier) {
        this.alamat_supplier = alamat_supplier;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "DataSupplier{" + "id_supplier=" + id_supplier + ", nama_supplier=" + nama_supplier + ", alamat_supplier=" + alamat_supplier + ", telepon=" + telepon + '}';
    }
    
}
