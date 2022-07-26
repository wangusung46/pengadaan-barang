package pbarang.model.pembelian;

import java.util.Date;

public class Pembelian {
    
    private Long id;
    private Long IdKontrak;
    private String namaKontrak;
    private Date tanggalRo;
    private Long idSupplier;
    private String namaSupplier;
    private Long netto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdKontrak() {
        return IdKontrak;
    }

    public void setIdKontrak(Long IdKontrak) {
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

    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Long getNetto() {
        return netto;
    }

    public void setNetto(Long netto) {
        this.netto = netto;
    }

    @Override
    public String toString() {
        return "Pembelian{" + "id=" + id + ", IdKontrak=" + IdKontrak + ", namaKontrak=" + namaKontrak + ", tanggalRo=" + tanggalRo + ", idSupplier=" + idSupplier + ", namaSupplier=" + namaSupplier + ", netto=" + netto + '}';
    }
    
}
