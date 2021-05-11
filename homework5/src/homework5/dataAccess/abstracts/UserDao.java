package homework5.dataAccess.abstracts;

import homework5.entities.concretes.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(User user);

    User get(int id);

    List<User> getAll();
}
