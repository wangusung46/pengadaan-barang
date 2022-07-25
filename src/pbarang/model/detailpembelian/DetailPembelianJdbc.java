package pbarang.model.detailpembelian;

import java.util.List;

public interface DetailPembelianJdbc {

    public List<DetailPembelian> selectAll();
    
    public DetailPembelian select(Long request);

    public void insert(DetailPembelian request);

    public void update(DetailPembelian request);
    
    public void delete(Long request);

}
