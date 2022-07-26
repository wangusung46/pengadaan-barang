package pbarang.model.penjualan;

import java.util.Date;

public class Penjualan {
    
   private Long id;
   private Date tanggalPenjualan;
   private Long idPembelian;
   private Long netto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTanggalPenjualan() {
        return tanggalPenjualan;
    }

    public void setTanggalPenjualan(Date tanggalPenjualan) {
        this.tanggalPenjualan = tanggalPenjualan;
    }

    public Long getIdPembelian() {
        return idPembelian;
    }

    public void setIdPembelian(Long idPembelian) {
        this.idPembelian = idPembelian;
    }

    public Long getNetto() {
        return netto;
    }

    public void setNetto(Long netto) {
        this.netto = netto;
    }

    @Override
    public String toString() {
        return "Penjualan{" + "id=" + id + ", tanggalPenjualan=" + tanggalPenjualan + ", idPembelian=" + idPembelian + ", netto=" + netto + '}';
    }
   
}
