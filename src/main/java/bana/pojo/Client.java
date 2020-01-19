package bana.pojo;

public class Client {

	
	String username;
	String Name;
	String City;
	String Address;
	String Email;
	String PhoneNumber;
	String Type;
	String id;
	
	
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public Client(String username, String name, String city, String address, String email, String phoneNumber,
			String type, String id) {
		super();
		this.username = username;
		Name = name;
		City = city;
		Address = address;
		Email = email;
		PhoneNumber = phoneNumber;
		Type = type;
		this.id=id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
}
