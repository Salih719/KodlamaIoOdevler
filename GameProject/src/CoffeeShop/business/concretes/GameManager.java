package CoffeeShop.business.concretes;

import CoffeeShop.business.abstracts.GameService;
import CoffeeShop.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi : " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi : " + game.getName());
	}

}
