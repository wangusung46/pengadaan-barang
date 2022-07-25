package pbarang.model.detailpenjualan;

public class DetailPenjualan {
  
   private Long id;
   private Long idPenjualan;
   private String barang;
   private String satuan;
   private Long volume;
   private Long harga;
   private Long subtotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(Long idPenjualan) {
        this.idPenjualan = idPenjualan;
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

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetailPenjualan{" + "id=" + id + ", idPenjualan=" + idPenjualan + ", barang=" + barang + ", satuan=" + satuan + ", volume=" + volume + ", harga=" + harga + ", subtotal=" + subtotal + '}';
    }
  
}
