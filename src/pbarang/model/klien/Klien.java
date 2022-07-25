package pbarang.model.klien;

public class Klien {
    
    private Long id;
    private String nama;
    private String alamat;
    private String telepon;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
        return "Klien{" + "id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", telepon=" + telepon + '}';
    }
    
}
