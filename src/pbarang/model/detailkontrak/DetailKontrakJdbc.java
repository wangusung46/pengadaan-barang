package pbarang.model.detailkontrak;

import java.util.List;

public interface DetailKontrakJdbc {

    public List<DetailKontrak> selectAll();

    public void insert(DetailKontrak request);

    public void update(DetailKontrak request);
    
    public void delete(Long request);

}
