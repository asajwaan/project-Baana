package bana.pojo;


public class Content {

	String name=null;
	String type=null;
	String price=null;
	String Discount=null;
	
	public Content()
	{
		
	}
	public Content(String name, String type, String price, String Discount) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.type=type;
		this.price=price;
		this.Discount=Discount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	
	
}
