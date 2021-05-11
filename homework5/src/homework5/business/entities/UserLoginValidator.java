package homework5.business.entities;

import homework5.business.abstracts.LoginValidator;
import homework5.entities.concretes.User;

public class UserLoginValidator implements LoginValidator {

    public boolean validate(User user, String email, String password) {
        if (user.getEmail() == email & user.getPassword() == password) {
            return true;
        } else {
            return false;
        }
    }


}
