import homework5.business.abstracts.LoginValidator;
import homework5.business.abstracts.RegisterValidator;
import homework5.business.entities.*;
import homework5.core.*;
import homework5.dataAccess.abstracts.UserDao;
import homework5.dataAccess.entities.HibernateUserDao;
import homework5.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        //Entities
        User user1 = new User(1, "Melih", "Çakay", "melihcakay@outlook.com", "127");
        User user2 = new User(2, "Gökay", "Deniz", "gokaydeniz@outlook.com", "15359665");
        User user3 = new User(3, "Barış", "Telci", "baristelcidnd@outlook.com", "1549646n5b6");
        User user4 = new User(4, "Bariş", "Telci", "baristelcidnd@outlook.com", "13218456");

        //Core
        RegisterValidator[] registerValidators = {new EmailValidator(), new FirstNameValidator(), new LastNameValidator(), new PasswordValidator()};
        LoginValidator[] loginValidators = {new UserLoginValidator()};

        //Data Access
        UserDao hibernateDao = new HibernateUserDao();

        //Business

        UserManager userRegisterManager = new UserManager(hibernateDao, registerValidators);
        userRegisterManager.register(user1);
        userRegisterManager.register(user2);
        userRegisterManager.register(user3);
        userRegisterManager.register(user4);


        UserManager userLoginManager = new UserManager(hibernateDao, loginValidators);
        userLoginManager.login(user2, "gokaydeniz@outlook.com", "15359665");
        userLoginManager.login(user3, "baristelcidnd@outlook.com", "156465413");


        GoogleLoginAdapter googleLogin = new GoogleLoginAdapter();
        googleLogin.registerWithGoogle(user3);
        googleLogin.loginWithGoogle(user3);

    }
}
