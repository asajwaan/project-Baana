package bana.pojo;


public class LineItem {

	String id=null;
	String name=null;
	String type=null;
	String price=null;
	String Discount=null;
	
	public LineItem()
	{
		
	}
	public LineItem(String name, String type, String price, String Discount,String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.type=type;
		this.price=price;
		this.Discount=Discount;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
