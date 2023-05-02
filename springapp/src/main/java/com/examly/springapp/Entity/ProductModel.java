package com.examly.springapp.Entity;

import java.io.Serializable;


import javax.persistence.*;

@Entity
public class ProductModel implements Serializable{

	@Id
	int productId;
	String imageUrl;
	String productName;
	String price;
	String description;
	int quantity;
	

public ProductModel() {
	super();
	// TODO Auto-generated constructor stub
}


public ProductModel(int productId, String imageUrl, String productName, String price, String description,
		int quantity) {
	super();
	this.productId = productId;
	this.imageUrl = imageUrl;
	this.productName = productName;
	this.price = price;
	this.description = description;
	this.quantity = quantity;
}


public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public String getImageUrl() {
	return imageUrl;
}


public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public String getPrice() {
	return price;
}


public void setPrice(String price) {
	this.price = price;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


@Override
public String toString() {
	return "ProductModel [productId=" + productId + ", imageUrl=" + imageUrl + ", productName=" + productName
			+ ", price=" + price + ", description=" + description + ", quantity=" + quantity + "]";
}



}