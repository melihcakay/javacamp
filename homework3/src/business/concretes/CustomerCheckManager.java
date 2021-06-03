package business.concretes;


import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import mernisReference.RKNKPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        return true;
    }
}
