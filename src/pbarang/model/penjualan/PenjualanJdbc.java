package pbarang.model.penjualan;

import java.util.List;

public interface PenjualanJdbc {

    public List<Penjualan> selectAll();

    public void insert(Penjualan request);

    public void update(Penjualan request);
    
    public void delete(Long request);

}
