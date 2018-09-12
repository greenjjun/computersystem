package test;

public class StaticTest {

	public static void main(String[] args) {
		StaticClass clazz = new StaticClass();
		
		clazz.increment();
		clazz.printA();
		
		StaticClass clazz1 = new StaticClass();
		
		clazz1.increment();
		clazz1.printA();
		
		StaticClass.a = 1111;
		StaticClass.print();
		
		String x = "Hello World!";
		System.out.println(StringUtil.strlen(x));
	}

}
