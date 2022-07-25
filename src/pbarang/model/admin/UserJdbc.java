package pbarang.model.admin;

public interface UserJdbc {

    public Boolean login(String userName, String password);

    public void insert(User request);

    public String selectRole(String text);

}
