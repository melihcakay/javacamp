package homework5.business.entities;

import homework5.business.abstracts.RegisterValidator;
import homework5.entities.concretes.User;

import java.util.List;

public class PasswordValidator implements RegisterValidator {

    String name = "Şifre";

    @Override
    public String getName() {
        return name;
    }

    public boolean validate(User user) {
        if (user.getPassword().length() < 6) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public boolean isThere(User user, List<User> Users) {
        return false;
    }


}
