package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus orderStatus;
	private List<OrderItem> orderItem = new ArrayList<>();
	private Client client = new Client();
	
	public Order(Date moment, OrderStatus orderStatus) {
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	

}
