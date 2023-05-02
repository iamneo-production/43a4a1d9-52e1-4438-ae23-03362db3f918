package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Entity.ProductModel;
import com.examly.springapp.Service.ProductModelService;
@RestController
@CrossOrigin("http://localhost:4200")
public class ProductModelController {

	@Autowired
	private ProductModelService productModelService;
	
	//For Homepage Controller
	
	@GetMapping("/home")
	public List<ProductModel> getProductList(){
		return productModelService.getHomeProduct();
	}
	
	@GetMapping(value="/home/{id}",produces="application/json")
	public ProductModel getById(@PathVariable("id") int id) {
		return productModelService.getByProductId(id);
	}
	
	
	//For Admin Controller
	
	@GetMapping("/admin")
	public List<ProductModel> getAllProdList(){
		return productModelService.getAllProduct();
	}
	

	@PostMapping("/admin/{id}")
	public ProductModel addProduct(@RequestBody ProductModel productmodel) {
		return productModelService.productSave(productmodel);
	}
	
	@PostMapping("/admin/addProduct")
	public ProductModel addProductModel(@RequestBody ProductModel productmodel) {
		return productModelService.ProductEditSave(productmodel);
	
	}
	@DeleteMapping("/admin/delete/{id}")
	public void  deleteProduct(@PathVariable("id")int id) {
		productModelService.productDelete(id);
		
	}
}
