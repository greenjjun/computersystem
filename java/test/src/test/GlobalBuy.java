package test;

public class GlobalBuy {

	protected String card;
	protected int customNum;
	protected String product;
	
	public GlobalBuy(String product){
		this.product = product;
	}
	
	public String getCard() {
		return card;
	}
	
	public void setCard(String card) {
		this.card = card;
	}
	
	public int getCustomNum(){
		return customNum;
	}
	
	public void setCustomNum(int customNum) {
		this.customNum = customNum; 
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public void pay() {
		System.out.println(product + "가 " + card + "로 결제되었습니다.");
	}

}
