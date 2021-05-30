package CoffeeShop.adapters.mernisService;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShop.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			result =client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()),
					gamer.getFirstName().toUpperCase(new Locale("tr")),
					gamer.getLastName().toUpperCase(new Locale("tr")),
					gamer.getTimeOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		return result;		
		
	}
	
	
}
