package Business;

import Business.Checker;

public class Utils {

    public static void runCheckers(Checker[] checkers, String message) {
        for (Checker checker : checkers) {
            checker.check(message);
        }
    }

}



