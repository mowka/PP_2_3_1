package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void save(User user);
    public void deleteUser(long id);
    public User getUser(long id);
}
