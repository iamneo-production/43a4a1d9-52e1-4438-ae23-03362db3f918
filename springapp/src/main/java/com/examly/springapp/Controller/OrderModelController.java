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

import com.examly.springapp.Entity.CartModel;
import com.examly.springapp.Entity.OrderModel;
import com.examly.springapp.Entity.ProductModel;
import com.examly.springapp.Repository.OrderModelRepo;
import com.examly.springapp.Service.OrderModelService;

@CrossOrigin("http://localhost:4200")
@RestController
public class OrderModelController {

	@Autowired
	private OrderModelService orderModelServices;

	
	 @PostMapping("/saveOrder")
	 public OrderModel addOrder(@RequestBody OrderModel orderModel){
		 
		 return orderModelServices.addOrder(orderModel);
		 }
	 
	 @PostMapping("/placeOrder")
	 public OrderModel placeOrder(@RequestBody CartModel cartModel){
		 
		 OrderModel orderModel=new OrderModel();
		 
		 orderModel.setProductName(cartModel.getProductName());
		 orderModel.setQuantity(cartModel.getQuantity());
		 orderModel.setPrice(cartModel.getPrice());
		 orderModel.setStatus(null);
		 orderModel.setTotalPrice(null);
		 return orderModelServices.addOrder(orderModel);
		 }
	 
	 @DeleteMapping("/{orderId}")
	 public void deleteOrderById(@PathVariable int orderId){
		 orderModelServices.deleteOrder(orderId); 
		 }
	 
	 @GetMapping("/orders")
	 public List<OrderModel> getOrdersList(){
		 return orderModelServices.getAllOrders();
		 }
    

}
