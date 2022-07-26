package pbarang.model.admin;

import java.util.List;

public interface UserJdbc {

    public Boolean login(String userName, String password);

    public void insert(User request);

    public String selectRole(String text);

    public List<User> selectAll();

    public User select(String parseLong);

}
