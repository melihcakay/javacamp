package Business;
import Entities.*;
import Business.Checker;

public class UserManager {
    private Checker[] checkers;
    private String name;

    public UserManager(Checker[] checkers) {
        this.checkers = checkers;
    }

    public String getName(User user) {
        this.name = user.getFirstName() + " " + user.getLastName();
        return name;
    }

    public void add(User user) {
        System.out.println("-----------------------");
        Utils.runCheckers(checkers, getName(user));
        System.out.println("Kullanıcı eklendi: " + getName(user));
    }

    public void delete(User user) {
        System.out.println("-----------------------");
        System.out.println("Kullancı silindi: " + getName(user));
    }


}
