/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import DB.StockItemData;
import Enum.Status;
import factory.CartItemDaoImplFactory;
import factory.StockItemDaoImplFactory;
import java.util.List;
import modal.CartItem;
import modal.StockItem;

/**
 *
 * @author udeshay
 */
public class CartItemService {
    	/*
	 *
	 * @param cartItem the item which you have to add in list
	 * 
	 * @return  "Status.SUCCESS"
	 * */
	public static  Status addItem(CartItem cartItem){
		
		return CartItemDaoImplFactory.getCartItemDaoImplInstance().saveCartItem(cartItem);
		 
	}
	
	
    

	/*
	 * 
     * @param cartItem the item which you have to delete from list
     * @return "Status.SUCCESS" if item is already in cartItem list else return "Status.NOT_EXIST"
     * */
    public Status deleteItem(CartItem cartItem){
    	
    	int index=0;
    	//calling dao for getting stock item list
    	List<CartItem> cartItems = CartItemDaoImplFactory.getCartItemDaoImplInstance().getAllCartItem();
    	
    	
    	for (CartItem item : cartItems) {
    		
    		//If item found then delete it by index
            if (item.getId()==cartItem.getId()) {
            	CartItemService.
                return Status.SUCCESS;
            }
            
            index++;//incrementing index 
        }
    	
    	return Status.NOT_EXIST;
    }
    
    
    /*
	 * @param stockItem the item which quantity you have to update in list
     *
     * @return "Status.SUCCESS" if item quantity has updated else return "Status.NOT_EXIST"
     * */
    public Status updatedItem(StockItem stockItem,int quantity){
    	
    	//calling dao for getting stock item list
    	List<StockItem> stockItems = StockItemDaoImplFactory.getStockItemDaoImplInstance().getAllStockItem();
    	
    	
    	for (StockItem item : stockItems) {
    		//If item found then update quantity
            if (item.getId()==stockItem.getId()) {
                item.setQuantity(quantity);
                return Status.SUCCESS;
            }
            
        }
    	
    	return Status.NOT_EXIST;
    }
    
    
    /*
	 * 
     * @param pId stockItem Id
     * @return stockItem stockItem which found in Stock by id 
     *     else "null" if not found in Stock
     * */
    public static StockItem getItemById(int pId) {
    	
    	//calling dao for getting stock item list
    	List<StockItem> stockItems = StockItemDaoImplFactory.getStockItemDaoImplInstance().getAllStockItem();
    	
    	for (StockItem item : stockItems) {
    		//If item found then update quantity
            if (item.getId()==pId) {
                return item;
            }
            
        }
        return null;
    }
    
    
    /*
     * @return list of item which are in stock
     * */
    public static List<StockItem> getAllStockItem(){
    	//calling Dao for All stock item list
    	return StockItemDaoImplFactory.getStockItemDaoImplInstance().getAllStockItem();    
    }
    
}
