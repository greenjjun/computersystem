package test;

public class NespressoMachine implements CoffeMachine {
	
	@Override
	public void brew(String coffee) {
		System.out.println("Nespresso�� " + coffee + "�� �����!");
	}
	
	@Override
	public void clean() {
		System.out.println("Nespresso�� û���Ѵ�!");
	}

}
