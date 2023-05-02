package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Entity.OrderModel;
import com.examly.springapp.Repository.OrderModelRepo;

@Service
public class OrderModelService {

	@Autowired
	private OrderModelRepo orderRepo;

	public OrderModelService() {
		// TODO Auto-generated constructor stub
	}

	public OrderModelService(OrderModelRepo repo) {
		super();
		this.orderRepo = orderRepo;
	}


	public OrderModel addOrder(OrderModel orderModel) {
	
		return orderRepo.save(orderModel);
	}
	 
	public void deleteOrder(int orderId) {

		orderRepo.deleteById(orderId);
	}

	public List<OrderModel> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}
}
