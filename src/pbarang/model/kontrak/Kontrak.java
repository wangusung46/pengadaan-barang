package pbarang.model.kontrak;

import java.util.Date;

public class Kontrak {
    
    private Long id;
    private Date tanggalKontrak;
    private Long idKlien;
    private String namaKlien;
    private String namaProyek;
    private String user;
    private String namaUser;
    private Long nilaiKontrak;
    private Long lamaProyek;
    private String syaratPembayaran;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTanggalKontrak() {
        return tanggalKontrak;
    }

    public void setTanggalKontrak(Date tanggalKontrak) {
        this.tanggalKontrak = tanggalKontrak;
    }

    public Long getIdKlien() {
        return idKlien;
    }

    public void setIdKlien(Long idKlien) {
        this.idKlien = idKlien;
    }

    public String getNamaKlien() {
        return namaKlien;
    }

    public void setNamaKlien(String namaKlien) {
        this.namaKlien = namaKlien;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public Long getNilaiKontrak() {
        return nilaiKontrak;
    }

    public void setNilaiKontrak(Long nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
    }

    public Long getLamaProyek() {
        return lamaProyek;
    }

    public void setLamaProyek(Long lamaProyek) {
        this.lamaProyek = lamaProyek;
    }

    public String getSyaratPembayaran() {
        return syaratPembayaran;
    }

    public void setSyaratPembayaran(String syaratPembayaran) {
        this.syaratPembayaran = syaratPembayaran;
    }

    @Override
    public String toString() {
        return "Kontrak{" + "id=" + id + ", tanggalKontrak=" + tanggalKontrak + ", idKlien=" + idKlien + ", namaKlien=" + namaKlien + ", namaProyek=" + namaProyek + ", user=" + user + ", namaUser=" + namaUser + ", nilaiKontrak=" + nilaiKontrak + ", lamaProyek=" + lamaProyek + ", syaratPembayaran=" + syaratPembayaran + '}';
    }
    
}
