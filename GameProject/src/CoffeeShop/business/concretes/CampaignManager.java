package CoffeeShop.business.concretes;

import CoffeeShop.business.abstracts.CampaignService;
import CoffeeShop.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + "Kampanya eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "Kampanya Silindi");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + "Kampanya Güncellendi");
	}

}
