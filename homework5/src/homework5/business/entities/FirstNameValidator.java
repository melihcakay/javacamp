package homework5.business.entities;

import homework5.business.abstracts.RegisterValidator;
import homework5.entities.concretes.User;

import java.util.List;

public class FirstNameValidator implements RegisterValidator {

    String name = "İsim";

    @Override
    public String getName() {
        return name;
    }

    public boolean validate(User user) {
        if (user.getFirstName().length() < 2) {
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

