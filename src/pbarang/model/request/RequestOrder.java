package pbarang.model.request;

import java.util.Date;

public class RequestOrder {
    
    private int id_ro;
    private int id_kontrak;
    private Date tgl_ro;
    private int id_supplier;
    private float netto;

    public int getId_ro() {
        return id_ro;
    }

    public void setId_ro(int id_ro) {
        this.id_ro = id_ro;
    }

    public int getId_kontrak() {
        return id_kontrak;
    }

    public void setId_kontrak(int id_kontrak) {
        this.id_kontrak = id_kontrak;
    }

    public Date getTgl_ro() {
        return tgl_ro;
    }

    public void setTgl_ro(Date tgl_ro) {
        this.tgl_ro = tgl_ro;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public float getNetto() {
        return netto;
    }

    public void setNetto(float netto) {
        this.netto = netto;
    }

    @Override
    public String toString() {
        return "RequestOrder{" + "id_ro=" + id_ro + ", id_kontrak=" + id_kontrak + ", tgl_ro=" + tgl_ro + ", id_supplier=" + id_supplier + ", netto=" + netto + '}';
    }
    
}
