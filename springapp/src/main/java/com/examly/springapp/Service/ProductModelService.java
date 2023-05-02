package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Entity.ProductModel;
import com.examly.springapp.Repository.ProdeuctModelRepo;

@Service
public class ProductModelService {

	@Autowired
	private ProdeuctModelRepo productModelRepo;
	
	public ProductModelService() {}
	
	public ProductModelService(ProdeuctModelRepo productModelRepo) {
		super();
		this.productModelRepo = productModelRepo;
	}


	public List<ProductModel> getAllProduct() {
		return productModelRepo.findAll();
	}


	public List<ProductModel> getHomeProduct() {
		return productModelRepo.findAll();
	}


	public ProductModel productSave(ProductModel productmodel) {
		return productModelRepo.save(productmodel);

	}

	public ProductModel ProductEditSave(ProductModel productmodel) {
		return productModelRepo.save(productmodel);
	}

	public String productDelete(int productId) {
		productModelRepo.deleteById(productId);
		return "deleted";
	}
	
	public ProductModel getByProductId(int cartItemID)
	{
		return productModelRepo.findById(cartItemID).get();
	}
}
