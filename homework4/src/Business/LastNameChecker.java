package Business;

import Business.Checker;

public class LastNameChecker implements Checker {
    @Override
    public void check(String message) {
        System.out.println("Soyisim doğrulandı: " + message);
    }
}
