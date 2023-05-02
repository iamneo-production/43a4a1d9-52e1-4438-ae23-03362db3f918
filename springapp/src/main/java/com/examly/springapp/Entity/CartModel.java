package com.examly.springapp.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class CartModel {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	int cartItemID;
	int userId;
	String productName;
	int quantity;
	String price;

	@ManyToOne( targetEntity = ProductModel.class,cascade = CascadeType.ALL)
	private List<ProductModel> productModel;

	

	public int getCartItemID() {
		return cartItemID;
	}



	public void setCartItemID(int cartItemID) {
		this.cartItemID = cartItemID;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public List<ProductModel> getProductModel() {
		return productModel;
	}



	public void setProductModel(List<ProductModel> productModel) {
		this.productModel = productModel;
	}



	public CartModel(int cartItemID, int userId, String productName, int quantity, String price,
			List<ProductModel> productModel) {
		this.cartItemID = cartItemID;
		this.userId = userId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.productModel = productModel;
	}



	public CartModel() {
	}



	@Override
	public String toString() {
		return "CartModel [cartItemID=" + cartItemID + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", productModel=" + productModel + "]";
	}
	

	

	
}
