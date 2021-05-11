package homework5.business.abstracts;

import homework5.entities.concretes.User;

import java.util.List;

public interface UserService {

    void register(User user);

    void login(User user,String email,String password);

    void delete(User user);

    void get(int id);


}
