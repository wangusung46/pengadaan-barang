package pbarang.model.penjualan;

import java.util.Date;

public class Penjualan {
    
   private Long id;
   private Date tanggalPenjualan;
   private int idPenjualan;
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

    public int getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(int idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public Long getNetto() {
        return netto;
    }

    public void setNetto(Long netto) {
        this.netto = netto;
    }

    @Override
    public String toString() {
        return "Penjualan{" + "id=" + id + ", tanggalPenjualan=" + tanggalPenjualan + ", idPenjualan=" + idPenjualan + ", netto=" + netto + '}';
    }
   
}
