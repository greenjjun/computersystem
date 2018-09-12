package test;

public class Test {

	public static void main(String[] args) {
		GlobalBuy globalBuy = new GlobalBuy("Shoes"); 
		
		globalBuy.setCard("1310 0258 4394 5623");
		globalBuy.setCustomNum(1900);
		
		System.out.println(globalBuy.getCard());
		System.out.println(globalBuy.getCustomNum());
		System.out.println(globalBuy.getProduct());
		
		globalBuy.pay();
		
		AmazonInfo amazonInfo = new AmazonInfo("Dyson", "SEOK"); 
		amazonInfo.setAddress("OR");
		amazonInfo.setCard("5023 1604 7896 2365");
		
		amazonInfo.pay();
		
		GlobalBuy x = new AmazonInfo("ss", "dd");
		System.out.println(x instanceof AmazonInfo);
	}
	
	public static void amazon(AmazonInfo a) {
		
	}
}
