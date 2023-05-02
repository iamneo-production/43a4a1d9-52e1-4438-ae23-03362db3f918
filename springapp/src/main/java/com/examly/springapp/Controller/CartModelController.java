package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Entity.CartModel;
import com.examly.springapp.Entity.ProductModel;
import com.examly.springapp.Service.CartModelService;

@CrossOrigin("*")
@RestController
public class CartModelController {

	@Autowired
	private CartModelService cartService;
	
	@GetMapping("/get")
	public List<CartModel> getall()
	{
		return cartService.getCart();
	}
	
	@PostMapping("/home/101")
	public CartModel saveToCart(@RequestBody CartModel cartModel)
	{
		return cartService.saveCart(cartModel);
	}
	
	@PostMapping("/cart/add1")
	public CartModel addCart(@RequestBody ProductModel productModel)
	{
		System.out.println("product model "+productModel);
		CartModel cartModel=new CartModel();
//		cartModel.setCartItemID("0");
		cartModel.setProductName(productModel.getProductName());
		cartModel.setPrice(productModel.getPrice());
		cartModel.setQuantity(productModel.getQuantity());
		System.out.println("cartModel"+cartModel);
		return cartService.addToCart(cartModel);
	}
	
	@GetMapping("/cart/{id}")
	public CartModel cartById(@PathVariable("id") int  cartItemID)
	{
		return cartService.getCartById(cartItemID);
	}

}
