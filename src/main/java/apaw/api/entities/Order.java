package apaw.api.entities;

import java.util.Calendar;

public class Order {
	
	private int id;
	private Calendar date;
	private int amount;
	
	public Order() {
		
	}
	
	public Order(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Calendar getDate() {
		return date;
	}
	
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "{\"id\":" + id + ",\"date\":\"" + date + ",\"amount\":\"" + amount + "\"}";
	}

}
