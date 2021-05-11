package homework5.business.entities;

import homework5.business.abstracts.UserService;
import homework5.business.abstracts.LoginValidator;
import homework5.business.abstracts.RegisterValidator;
import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private String name;
    private RegisterValidator[] registerValidators;
    private LoginValidator[] loginValidators;


    public UserManager() {

    }

    public UserManager(UserDao userDao, RegisterValidator[] registerValidators) {

        this.userDao = userDao;
        this.registerValidators = registerValidators;

    }

    public UserManager(UserDao userDao, LoginValidator[] loginValidators) {

        this.userDao = userDao;
        this.loginValidators = loginValidators;

    }


    public String getName(User user) {
        return name = user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public void register(User user) {
        System.out.println("--------------------------------");
        userDao.add(user);
        for (RegisterValidator validator : registerValidators) {
            if (validator.validate(user) == false) {
                System.out.println(getName(user) + " " + "için doğrulanamadı: " + validator.getName());
                return;
            }

        }
        for (RegisterValidator registerValidator : registerValidators) {
            if (registerValidator.isThere(user, userDao.getAll()) == true) {
                System.out.println("Email zatem sisteme kayıtlıdır.");
                return;
            }
        }

        System.out.println("Doğrulama epostası gönderildi: " + getName(user));
        System.out.println("Doğrulama onaylandı, kayıt başarıyla oluşturuldu: " + getName(user));
    }


    @Override
    public void login(User user, String email, String password) {
        System.out.println("--------------------------------");
        for (LoginValidator loginValidator : loginValidators) {
            if (loginValidator.validate(user, email, password) == false) {
                System.out.println(getName(user) + " " + "için giriş yapılamadı, email ya da şifre hatalı.");
                return;
            } else {
                System.out.println("Başarıyla giriş yapıldı: " + getName(user));
            }
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void get(int id) {

    }
}

