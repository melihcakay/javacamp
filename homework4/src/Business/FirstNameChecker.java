package Business;

import Business.Checker;

public class FirstNameChecker implements Checker {
    @Override
    public void check(String message) {
        System.out.println("İsim doğrulandı: " + message);
    }
}
