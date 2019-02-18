package model;

import java.util.List;

public class Cart {
	
	private Customer customer;
	private int orderNumber;
	private List<Product> products;
	
	 /*
	 * @return orderNumber 
	 * */
    public int getOrderNum() {
        return orderNumber;
    }
 
    /*
	 * @param orderNumber 
	 * */
    public void setOrderNum(int orderNum) {
        this.orderNumber = orderNum;
    }
 
    /*
   	 * @return customer cart owner
   	 * */
    public Customer getCustomer() {
        return customer;
    }
 
    /*
   	 * @param customer cart owner
   	 * */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
 
    /*
   	 * @return products list of product added in cart 
   	 * */
    public List<Product> getCartItems() {
        return this.products;
    }
    
    
    
    
    /*
     * @param pId product Id
     * @return product product which found in cart by id 
     *     else "null" if not found in cart
     * */
    private Product getProductById(int pId) {
        for (Product product : this.products) {
            if (product.getId()==(pId)) {
                return product;
            }
        }
        return null;
    }
    
    public void addProduct(Product product, int quantity) {
        Product thisProduct = this.getProductById(product.getId());
 
        if (thisProduct == null)//if product is not present in cart from earlier
        {
        	thisProduct = new Product();
        	thisProduct.setQuantity(0);
        	thisProduct.setProductInfo(productInfo);
            this.cartLines.add(line);
        }
        int newQuantity = line.getQuantity() + quantity;
        if (newQuantity <= 0) {
            this.cartLines.remove(line);
        } else {
            line.setQuantity(newQuantity);
        }
    }
}
