package homework5.business.abstracts;

import homework5.entities.concretes.User;

import java.util.List;

public interface RegisterValidator {

    String getName();

    boolean validate(User user);

    boolean isThere(User user, List<User> Users);


}
