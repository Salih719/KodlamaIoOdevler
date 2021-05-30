package CoffeeShop.business.concretes;

import CoffeeShop.business.abstracts.CampaignService;
import CoffeeShop.business.abstracts.SaleService;
import CoffeeShop.entities.concretes.Campaign;
import CoffeeShop.entities.concretes.Game;
import CoffeeShop.entities.concretes.Gamer;

public class SaleManager implements SaleService {
	
	private CampaignService campaignService;
	
	public SaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}
	
	

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " Oyunu " + gamer.getFirstName() + " isimli kullan�c� taraf�ndan sat�n al�nd�.");
	}

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName() + " Oyunu " + campaign.getName() + " kampanyas� ile sat�n al�nd�." + " %" + campaign.getDiscount() + " indirim yap�ld�");
	}

}
