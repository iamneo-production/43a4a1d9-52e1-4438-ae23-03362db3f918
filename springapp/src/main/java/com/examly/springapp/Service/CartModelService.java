package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Entity.CartModel;
import com.examly.springapp.Repository.CartModelRepo;

@Service
public class CartModelService {

	@Autowired
	private CartModelRepo cartRepo;
	
	public CartModelService() {
		// TODO Auto-generated constructor stub
	}
	
	public CartModelService(CartModelRepo cartRepo) {
		super();
		this.cartRepo = cartRepo;
	}

	public CartModel addToCart(CartModel cartModel)
	{
		return cartRepo.save(cartModel);
	}
	
	public List<CartModel> getCart()
	{
		return cartRepo.findAll();
	}
	 
	public CartModel getCartById(int cartItemID )
	{
		return cartRepo.findById(cartItemID).get();
	}
	
	public CartModel saveCart(CartModel cartModel)
	{
		return cartRepo.save(cartModel);
	}
}

