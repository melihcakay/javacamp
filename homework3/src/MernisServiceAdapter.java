import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import mernisReference.RKNKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        RKNKPSPublicSoap rknkpsPublicSoap = new RKNKPSPublicSoap();
        return rknkpsPublicSoap.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
    }
}
