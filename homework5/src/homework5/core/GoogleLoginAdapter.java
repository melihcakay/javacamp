package homework5.core;

import homework5.GoogleValidator.GoogleLogin;
import homework5.entities.concretes.User;

public class GoogleLoginAdapter implements GoogleService {

    private String name;

    public String getName(User user) {
        return this.name = user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public void registerWithGoogle(User user) {
        System.out.println("--------------------------------");
        GoogleLogin googleLogin = new GoogleLogin();
        googleLogin.register(getName(user));
    }

    @Override
    public void loginWithGoogle(User user) {
        System.out.println("--------------------------------");
        GoogleLogin googleLogin = new GoogleLogin();
        googleLogin.login(getName(user));
    }
}
