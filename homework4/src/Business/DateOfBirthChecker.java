package Business;

import Business.Checker;

public class DateOfBirthChecker implements Checker {
    @Override
    public void check(String message) {
        System.out.println("Doğum tarihi doğrulandı: " + message);
    }
}
