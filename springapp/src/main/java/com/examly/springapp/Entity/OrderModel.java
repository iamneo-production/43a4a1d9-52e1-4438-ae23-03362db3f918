package com.examly.springapp.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderModel {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	int orderId;
	int userId;
	String productName;
	int quantity;
	String totalPrice;
	String status;
	String price;
	
	@OneToOne(targetEntity = CartModel.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "cartItemID")
	private CartModel cartModel;
	
	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public CartModel getCartModel() {
		return cartModel;
	}

	public void setCartModel(CartModel cartModel) {
		this.cartModel = cartModel;
	}

	@Override
	public String toString() {
		return "OrderModel [orderId=" + orderId + ", userId=" + userId + ", productName=" + productName + ", quantity="
				+ quantity + ", totalPrice=" + totalPrice + ", status=" + status + ", price=" + price + ", cartModel="
				+ cartModel + "]";
	}

	public OrderModel(int orderId, int userId, String productName, int quantity, String totalPrice, String status,
			String price, CartModel cartModel) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.productName = productName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.status = status;
		this.price = price;
		this.cartModel = cartModel;
	}

	
	
	


}
