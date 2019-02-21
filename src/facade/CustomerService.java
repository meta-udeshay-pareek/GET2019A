package facade;

import java.util.List;

import dao.CustomerDaoImpl;
import factory.CustomerDaoImplFactory;
import Enum.Status;
import modal.Cart;
import modal.Customer;

public class CustomerService {

	
	/*
	 * @param id , userId for matching
	 * @return customer  if id matches with one of the customer in list else "null"
	 * */
	public static Customer getCustomerById(int id){
		//calling Dao for getting list of customer
		List<Customer> customers = CustomerDaoImplFactory.getCustomerDaoImplInstance().getAllCustomer();
		for(Customer customer:customers){
			if(customer.getId()==id){
				return customer;
			}
		}
		
		return null;
	}
        
        public static List<Customer> getAllCustomer(){
            //calling Dao
            return CustomerDaoImplFactory.getCustomerDaoImplInstance().getAllCustomer();
        }
        
        public static Status saveCustomer(Customer customer){
            //calling dao
            return CustomerDaoImplFactory.getCustomerDaoImplInstance().saveCustomer(customer);
        }
        
        public  static  Status deleteCustomer(Customer customer){
            int index=0;
            //calling Dao for getting list of customer
            List<Customer> customers = CustomerDaoImplFactory.getCustomerDaoImplInstance().getAllCustomer();
            for(Customer tempCustomer:customers){
                    if(customer.getId()==tempCustomer.getId()){
                            //calling dao for deleting customer
                            return CustomerDaoImplFactory.getCustomerDaoImplInstance().deleteCustomer(index);
                    }
                    index++;
            }
            
           return Status.NOT_EXIST; 
        }
        
        
        public Status updateCustomer(Customer customer, String name,String address, String email, String phone, Cart cart){
            //calling Dao for updating customer
            return CustomerDaoImplFactory.getCustomerDaoImplInstance().updateCustomer(customer, name, address, email, phone, cart);
        } 
}
