package pbarang.model.pembelian;

import java.util.List;

public interface PembelianJdbc {

    public List<Pembelian> selectAll();

    public void insert(Pembelian request);

    public void update(Pembelian request);
    
    public void delete(Long request);

    public Pembelian select(Long parseLong);

}
