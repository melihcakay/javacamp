package Business;

import Entities.*;

public class CampaignManager {

    public void add(Campaign campaign) {
        System.out.println("-----------------------");
        System.out.println("Kampanya Eklendi: " + campaign.getName());
    }

    public void delete(Campaign campaign) {
        System.out.println("-----------------------");
        System.out.println("Kampanya Silindi: " + campaign.getName());
    }
}
