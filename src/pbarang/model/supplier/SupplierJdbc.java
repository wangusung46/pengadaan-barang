package pbarang.model.supplier;

import java.util.List;

public interface SupplierJdbc {

    public List<Supplier> selectAll();
    
    public Supplier select(Long request);

    public void insert(Supplier request);

    public void update(Supplier request);
    
    public void delete(Long request);

}
