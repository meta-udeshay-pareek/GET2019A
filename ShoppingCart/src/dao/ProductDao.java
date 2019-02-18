package dao;

import javax.net.ssl.SSLEngineResult.Status;

import model.Product;

public interface ProductDao {
	public Product getProduct(int pId);
	public Status addProduct(Product product);
	public Status deleteProduct(Product product);
}
