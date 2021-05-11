package homework5.core;

import homework5.entities.concretes.User;

public interface GoogleService {

    void registerWithGoogle(User user);

    void loginWithGoogle(User user);
}
