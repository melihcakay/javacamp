package homework5.business.entities;

import homework5.business.abstracts.RegisterValidator;
import homework5.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements RegisterValidator {

    String name = "Email";

    @Override
    public String getName() {
        return name;
    }

    public boolean validate(User user) {
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getEmail());
        return matcher.find();
    }

    public boolean isThere(User user, List<User> Users) {

        for (User u : Users) {
            if (u.getEmail() == user.getEmail()) {
                return true;
            }
        }

        return false;

    }


}


