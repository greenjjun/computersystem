package test;

public class NespressoMachine implements CoffeMachine {
	
	@Override
	public void brew(String coffee) {
		System.out.println("Nespresso가 " + coffee + "를 만든다!");
	}
	
	@Override
	public void clean() {
		System.out.println("Nespresso를 청소한다!");
	}

}
