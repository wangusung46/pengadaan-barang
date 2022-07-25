package pbarang.model.klien;

import java.util.List;

public interface KlienJdbc {

    public List<Klien> selectAll();
    
    public Klien select(Long request);

    public void insert(Klien request);

    public void update(Klien request);
    
    public void delete(Long request);

}
