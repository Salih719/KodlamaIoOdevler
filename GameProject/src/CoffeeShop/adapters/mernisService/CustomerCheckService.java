package CoffeeShop.adapters.mernisService;

import CoffeeShop.entities.concretes.Gamer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Gamer gamer);
}
