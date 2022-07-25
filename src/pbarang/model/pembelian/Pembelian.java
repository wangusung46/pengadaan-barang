package pbarang.model.pembelian;

import java.util.Date;

public class Pembelian {
    
    private Long id;
    private int IdKontrak;
    private String namaKontrak;
    private Date tanggalRo;
    private int idSupplier;
    private String namaSupplier;
    private Float netto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdKontrak() {
        return IdKontrak;
    }

    public void setIdKontrak(int IdKontrak) {
        this.IdKontrak = IdKontrak;
    }

    public String getNamaKontrak() {
        return namaKontrak;
    }

    public void setNamaKontrak(String namaKontrak) {
        this.namaKontrak = namaKontrak;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }  
    
    public Date getTanggalRo() {
        return tanggalRo;
    }

    public void setTanggalRo(Date tanggalRo) {
        this.tanggalRo = tanggalRo;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Float getNetto() {
        return netto;
    }

    public void setNetto(Float netto) {
        this.netto = netto;
    }

    @Override
    public String toString() {
        return "Pembelian{" + "id=" + id + ", IdKontrak=" + IdKontrak + ", namaKontrak=" + namaKontrak + ", tanggalRo=" + tanggalRo + ", idSupplier=" + idSupplier + ", namaSupplier=" + namaSupplier + ", netto=" + netto + '}';
    }
    
}
