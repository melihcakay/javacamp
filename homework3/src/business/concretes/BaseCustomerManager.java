package business.concretes;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println("Added to database: " + customer.getFirstName());
    }
}
