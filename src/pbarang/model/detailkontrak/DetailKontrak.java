package pbarang.model.detailkontrak;

public class DetailKontrak {
    
    private Long id;
    private Long idKontrak;
    private String pekerjaan;
    private Long volume;
    private String satuan;
    private Long harga;
    private Long jumlah;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdKontrak() {
        return idKontrak;
    }

    public void setIdKontrak(Long idKontrak) {
        this.idKontrak = idKontrak;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Long getJumlah() {
        return jumlah;
    }

    public void setJumlah(Long jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "DetailKontrak{" + "id=" + id + ", idKontrak=" + idKontrak + ", pekerjaan=" + pekerjaan + ", volume=" + volume + ", satuan=" + satuan + ", harga=" + harga + ", jumlah=" + jumlah + '}';
    }    
    
}
