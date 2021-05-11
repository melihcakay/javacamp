package homework5.GoogleValidator;

import homework5.entities.concretes.User;

public class GoogleLogin {


    public void register(String name) {
        System.out.println("Google hesabı ile kayıt olundu: " + name);
    }

    public void login(String name) {
        System.out.println("Google hesabı ile giriş yapıldı: " + name);
    }
}
