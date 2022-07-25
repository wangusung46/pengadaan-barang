package pbarang.model.detailpembelian;

public class DetailPembelian {
    
    private Long id;
    private String barang;
    private String satuan;
    private Long volume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "DetailPembelian{" + "id=" + id + ", barang=" + barang + ", satuan=" + satuan + ", volume=" + volume + '}';
    }
    
}
