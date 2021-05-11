package Business;

import Entities.*;

public class GameStoreManager {
    private double discountedPrice;
    private String name;

    public String getName(User user) {
        this.name = user.getFirstName() + " " + user.getLastName();
        return name;
    }

    public double getDiscountedPrice(Game game, Campaign campaign) {
        this.discountedPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountRate()) / 100;
        return discountedPrice;
    }

    public void sell(Game game, User user, Campaign campaign) {
        System.out.println("-----------------------");
        System.out.println(game.getName() + " isimli oyun " + getName(user) + " isimli kullanıcıya " + getDiscountedPrice(game, campaign) + " liraya satıldı.");
    }

    public void sell(Game game, User user) {
        System.out.println("-----------------------");
        System.out.println(game.getName() + " isimli oyun " + getName(user) + " isimli kullanıcıya " + game.getPrice() + " liraya satıldı.");
    }
}
