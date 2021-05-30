package CoffeeShop.business.concretes;

import CoffeeShop.adapters.mernisService.CustomerCheckService;
import CoffeeShop.business.abstracts.GamerService;
import CoffeeShop.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	private CustomerCheckService customerCheckService;
	
	public GamerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void add(Gamer gamer) {
		if (this.customerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println("Kullan�c� eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
			
		}else {
			System.out.println("Kullan�c� do�ru de�il");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu G�ncellendi");
	}

}
