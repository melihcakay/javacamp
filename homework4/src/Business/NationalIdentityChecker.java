package Business;

import Business.Checker;

public class NationalIdentityChecker implements Checker {
    @Override
    public void check(String message) {
        System.out.println("TC kimlik numarası doğrulandı: " + message);
    }
}
