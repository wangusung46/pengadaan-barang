package pbarang.model.klien;

public class Klien {
    
    private Long id;
    private String nama;
    private String alamat;
    private Long telepon;    

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

    public Long getTelepon() {
        return telepon;
    }

    public void setTelepon(Long telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Klien{" + "id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", telepon=" + telepon + '}';
    }
    
}
