package pbarang.model.detailpenjualan;

import java.util.List;

public interface DetailPenjualanJdbc {

    public List<DetailPenjualan> selectAll();
    
    public DetailPenjualan select(Long request);

    public void insert(DetailPenjualan request);

    public void update(DetailPenjualan request);
    
    public void delete(Long request);

}
