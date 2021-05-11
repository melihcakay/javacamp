package Business;

import Business.*;
import Entities.*;

public class Main {

    public static void main(String[] args) {

        //Users
        User engin = new User(1, "Engin", "Demiroğ", "1453", "10101010100");
        User melih = new User(2, "Melih", "Çakay", "1892", "20211202125");

        //Games
        Game aoe2 = new Game(1, "Age of Empires 2", 150);
        Game halflife3 = new Game(2, "Half Life 3", 100);

        //Campaigns
        Campaign summer = new Campaign(1, "Yaz İndirimleri", 50);
        Campaign christmas = new Campaign(2, "Noel İndirimleri", 25);

        //Checkers
        Checker[] checkers = {new FirstNameChecker(), new LastNameChecker(), new NationalIdentityChecker(), new DateOfBirthChecker()};

        //User Manager
        UserManager userManager = new UserManager(checkers);
        userManager.add(engin);
        userManager.add(melih);

        //Game Manager
        GameManager gameManager = new GameManager();
        gameManager.addToStore(aoe2);
        gameManager.addToStore(halflife3);

        //Campaign Manager
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(summer);
        campaignManager.add(christmas);

        //Game Store Manager
        GameStoreManager gameStoreManager = new GameStoreManager();
        gameStoreManager.sell(aoe2, engin, summer);
        gameStoreManager.sell(halflife3, engin);
        gameStoreManager.sell(halflife3, melih, christmas);


    }
}
