package apaw.api.dtos;

import java.util.Calendar;

public class OrderDto {
	
	private int id;
	private Calendar date;
	private int amount;
	
	public OrderDto() {
		
	}
	
	public OrderDto(int id) {
		this.id = id;
	}
	
	public OrderDto(int id, Calendar date, int amount) {
		this.id = id;
		this.date = date;
		this.amount = amount;
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
	

}
