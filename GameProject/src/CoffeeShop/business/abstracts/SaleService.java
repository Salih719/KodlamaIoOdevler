package CoffeeShop.business.abstracts;

import CoffeeShop.entities.concretes.Gamer;
import CoffeeShop.entities.concretes.Campaign;
import CoffeeShop.entities.concretes.Game;

public interface SaleService {
	
	public void sale(Game game,Gamer gamer);
	public void saleWithCampaign(Game game, Campaign campaign);
}
