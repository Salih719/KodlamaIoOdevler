package CoffeeShop.adapters.mernisService;

import CoffeeShop.entities.concretes.Gamer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
