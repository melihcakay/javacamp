package homework5.dataAccess.entities;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    private String name;
    public List<User> Users = new ArrayList<>();

    public String getName(User user) {
        return name = user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public void add(User user) {
        System.out.println("Hibernate ile eklendi: " + getName(user));
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernate ile güncellendi: " + getName(user));
    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernate ile silindi: " + getName(user));
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return Users;
    }


}
