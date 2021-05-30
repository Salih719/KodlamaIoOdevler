package CoffeeShop.ConsoleUI;

import CoffeeShop.adapters.mernisService.MernisServiceAdapter;
import CoffeeShop.business.concretes.CampaignManager;
import CoffeeShop.business.concretes.GameManager;
import CoffeeShop.business.concretes.GamerManager;
import CoffeeShop.business.concretes.SaleManager;
import CoffeeShop.entities.concretes.Campaign;
import CoffeeShop.entities.concretes.Game;
import CoffeeShop.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		
		Gamer gamer = new Gamer(1,"Salih Mehmet","Kurt",2000,"12345678910");
		
		Game game = new Game(1,1,"forza horizon","araba oyunu",80);
		
		Campaign campaign = new Campaign(1,"Kýþ indirimi",50);
		
		//----------------------------------------------------
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		SaleManager saleManager = new SaleManager(new CampaignManager());
		saleManager.sale(game, gamer);
		saleManager.saleWithCampaign(game, campaign);
		
		//----------------------------------------------------
		
		
		
		
	}

}
