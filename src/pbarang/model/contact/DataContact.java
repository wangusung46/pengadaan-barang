package pbarang.model.contact;

import java.util.Date;

public class DataContact {
    
    private int id_kontrak;
    private String user;
    private String nama_proyek;
    private String lama_proyek;
    private Date tgl_kontrak;
    private Float nilai_kontrak;
    private int id_klien;
    private String syarat_pembayaran;

    public int getId_kontrak() {
        return id_kontrak;
    }

    public void setId_kontrak(int id_kontrak) {
        this.id_kontrak = id_kontrak;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNama_proyek() {
        return nama_proyek;
    }

    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public String getLama_proyek() {
        return lama_proyek;
    }

    public void setLama_proyek(String lama_proyek) {
        this.lama_proyek = lama_proyek;
    }

    public Date getTgl_kontrak() {
        return tgl_kontrak;
    }

    public void setTgl_kontrak(Date tgl_kontrak) {
        this.tgl_kontrak = tgl_kontrak;
    }

    public Float getNilai_kontrak() {
        return nilai_kontrak;
    }

    public void setNilai_kontrak(Float nilai_kontrak) {
        this.nilai_kontrak = nilai_kontrak;
    }

    public int getId_klien() {
        return id_klien;
    }

    public void setId_klien(int id_klien) {
        this.id_klien = id_klien;
    }

    public String getSyarat_pembayaran() {
        return syarat_pembayaran;
    }

    public void setSyarat_pembayaran(String syarat_pembayaran) {
        this.syarat_pembayaran = syarat_pembayaran;
    }

    @Override
    public String toString() {
        return "DataContact{" + "id_kontrak=" + id_kontrak + ", user=" + user + ", nama_proyek=" + nama_proyek + ", lama_proyek=" + lama_proyek + ", tgl_kontrak=" + tgl_kontrak + ", nilai_kontrak=" + nilai_kontrak + ", id_klien=" + id_klien + ", syarat_pembayaran=" + syarat_pembayaran + '}';
    }
    
}
