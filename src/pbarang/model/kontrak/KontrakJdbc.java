package pbarang.model.kontrak;

import java.util.List;

public interface KontrakJdbc {

    public List<Kontrak> selectAll();
    
    public Kontrak select(Long parseLong);

    public void insert(Kontrak request);

    public void update(Kontrak request);
    
    public void delete(Long request);

}
