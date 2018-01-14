package apaw.api.dtos;

import apaw.api.entities.Professional;

public class ProfessionalDto {
	
	private int phone;
	private int city;
	private String type;
	
	public ProfessionalDto() {
		
	}
	
	public ProfessionalDto(int phone) {
		this.phone = phone;
	}
	
	public ProfessionalDto(int phone, int city, String type) {
		this.phone = phone;
		this.city = city;
		this.type = type;
	}
	
	public ProfessionalDto(Professional professional) {
		this.phone = professional.getPhone();
		this.city = professional.getCity();
		this.type = professional.getType();
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
