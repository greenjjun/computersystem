package test2;

import java.util.Scanner;

public class True {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double korean, eng, math, avg;
		
		korean = scanner.nextDouble();
		eng = scanner.nextDouble();
		math = scanner.nextDouble();
		scanner.close();
		
		avg = (korean + eng + math)/3.0;
		
		System.out.println(String.format("%.2f", avg));
	}
}
