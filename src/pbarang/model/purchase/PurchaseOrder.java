package pbarang.model.purchase;

import java.util.Date;

public class PurchaseOrder {
    
    private int id_po;
    private Date tgl_po;
    private int id_ro;
    private float netto_po;

    public int getId_po() {
        return id_po;
    }

    public void setId_po(int id_po) {
        this.id_po = id_po;
    }

    public Date getTgl_po() {
        return tgl_po;
    }

    public void setTgl_po(Date tgl_po) {
        this.tgl_po = tgl_po;
    }

    public int getId_ro() {
        return id_ro;
    }

    public void setId_ro(int id_ro) {
        this.id_ro = id_ro;
    }

    public float getNetto_po() {
        return netto_po;
    }

    public void setNetto_po(float netto_po) {
        this.netto_po = netto_po;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" + "id_po=" + id_po + ", tgl_po=" + tgl_po + ", id_ro=" + id_ro + ", netto_po=" + netto_po + '}';
    }
    
}
