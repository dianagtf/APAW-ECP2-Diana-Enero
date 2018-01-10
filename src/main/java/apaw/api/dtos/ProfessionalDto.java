package apaw.api.dtos;

public class ProfessionalDto {
	
	private int phone;
	private int city;
	private String type;
	
	public ProfessionalDto() {
		
	}
	
	public ProfessionalDto(int phone) {
		this.phone = phone;
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

}
