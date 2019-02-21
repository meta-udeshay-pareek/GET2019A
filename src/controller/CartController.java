/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Enum.Status;
import facade.CustomerService;
import java.util.List;
import modal.Cart;
import modal.Customer;

/**
 *
 * @author udeshay
 */
public class CartController {
        public static Cart getCartById(int id){
		//calling facade/service
		return CartService.;
	}
        
        public static Status saveCustomer(Customer customer){
            //calling facade/service
            return CustomerService.saveCustomer(customer);
        }
        
        public static Status deleteCustomer(Customer customer){
            //calling facade/service
            return CustomerService.deleteCustomer(customer);
        }
        
        public static List<Customer> getAllCustomer(){
            //calling facade/service
            return CustomerService.getAllCustomer();
        }
}
