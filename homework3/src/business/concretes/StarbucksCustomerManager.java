package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckServices;

    @Override
    public void save(Customer customer) {
        if (customerCheckServices.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a real person.");
        }


    }

    public StarbucksCustomerManager(CustomerCheckService customerCheckServices) {
        this.customerCheckServices = customerCheckServices;
    }

}