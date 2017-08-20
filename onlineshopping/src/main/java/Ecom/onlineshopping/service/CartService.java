package Ecom.onlineshopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecom.onlineshopping.model.UserModel;
import Ecom.shopingbackend.dao.CartLineDAO;
import Ecom.shopingbackend.dto.Cart;
import Ecom.shopingbackend.dto.CartLine;

@Service("cartService")
public class CartService {

	@Autowired
	private CartLineDAO cartLineDAO;
	
	@Autowired
	private HttpSession session;
	
	//returns the cart of the user who has logged in
	private Cart getCart() 
	{
		return ((UserModel)session.getAttribute("userModel")).getCart();
		
	}
	
	// returns the entire cart lines
	public List<CartLine> getCartLines() {
		Cart cart = this.getCart();
		return cartLineDAO.list(cart.getId());
	}
}
