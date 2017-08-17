package Ecom.shopingbackend.dao;

import java.util.List;

import Ecom.shopingbackend.dto.Address;
import Ecom.shopingbackend.dto.Cart;
import Ecom.shopingbackend.dto.User;

public interface UserDAO {
	
	//add an user
	boolean addUser(User user);
	
	User getByEmail(String email);
	
	
	// add an address
	boolean addAddress(Address address);
	
	// alternative
	// address getBillingAddress(int userId);
	//List<Address> listShippingAddresses(int userId);
	
	
	
	Address getBillingAddress(User user);
	List<Address> listShippingAddresses(User user);
	
	
	
	// update a cart
	boolean updateCart(Cart cart);
	
}
