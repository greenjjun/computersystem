package test;

public class StaticClass {
	
	public static int a = 1;
	
	public void increment() {
		a ++;
	}
	
	public void printA() {
		System.out.println(a);
	}
	
	public static void print() {
		System.out.println(a);
	}
}
