package CoffeeShop.business.abstracts;

import CoffeeShop.entities.concretes.Gamer;

public interface GamerService {
	
	public void add(Gamer gamer);
	public void delete(Gamer gamer);
	public void update(Gamer gamer);
	
}
