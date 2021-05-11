package homework5.business.abstracts;

import homework5.entities.concretes.User;

public interface LoginValidator {


    boolean validate(User user, String email, String password);



}
