package test;

public class AmazonInfo extends GlobalBuy{

	private String address;
	private String name;
	
	public AmazonInfo(String product, String name) {
		super(product);
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void pay() {
		super.pay();
		System.out.println(name + "님이 주문 요청하신 " + product +"가 " + address + "로 발송 예정입니다");
	}
	
	public void amazon() {
		
	}
}
