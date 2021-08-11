package com.example.demo.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrdersModel {


	@Id
	@Column(name="order_id")
	private int order_id;

	@Column(name="stock_id")
	private int stock_id;
	
	@Column(name="stock_symbol")
	private String stock_symbol;	
//
//	@Column(name="user_id")
//	private String user_id;	
	
	@Column(name="bid")
	private String bid;
	
	@Column(name="status")
	private String status;
	
	@Column(name="creation_date")
	private Date creation_date;
	
	@Column(name= " execution_date")
	private Date execution_date;
	
	@Column(name="least_rate")
	private int least_rate;
	
	@Column(name="order_type")
	private String order_type;	

	@Column(name="quantity")
	private int quantity;

	@Column(name="purchase_rate")
	private float purchase_rate;

	public OrdersModel(int order_id, int stock_id, String stock_symbol, String bid, String status, Date creation_date,
			Date execution_date, int least_rate, String order_type, int quantity, float purchase_rate) {
		super();
		this.order_id = order_id;
		this.stock_id = stock_id;
		this.stock_symbol = stock_symbol;
		this.bid = bid;
		this.status = status;
		this.creation_date = creation_date;
		this.execution_date = execution_date;
		this.least_rate = least_rate;
		this.order_type = order_type;
		this.quantity = quantity;
		this.purchase_rate = purchase_rate;
	}
	public OrdersModel() {
		
	}
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getStock_id() {
		return stock_id;
	}

	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}

	public String getStock_symbol() {
		return stock_symbol;
	}

	public void setStock_symbol(String stock_symbol) {
		this.stock_symbol = stock_symbol;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getExecution_date() {
		return execution_date;
	}

	public void setExecution_date(Date execution_date) {
		this.execution_date = execution_date;
	}

	public int getLeast_rate() {
		return least_rate;
	}

	public void setLeast_rate(int least_rate) {
		this.least_rate = least_rate;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPurchase_rate() {
		return purchase_rate;
	}

	public void setPurchase_rate(float purchase_rate) {
		this.purchase_rate = purchase_rate;
	}
	
	
}
