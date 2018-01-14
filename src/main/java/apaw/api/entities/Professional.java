package apaw.api.entities;

public class Professional {
	
	private int id;
	private int phone;
	private int city;
	private String type;
	
	public Professional() {
		
	}
	
	public Professional(int phone) {
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public int getCity() {
		return city;
	}
	
	public void setCity(int city) {
		this.city = city;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "{\"phone\":" + phone + ",\"city\":\"" + city + ",\"type\":\"" + type + "\"}";
	}

}
