package by.tc.lesson2;

import java.util.Scanner; 

public class cicleRS {
	public static void main (String[] argc) {
		double radius;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert radius");
		radius = sc.nextDouble();	
		double circleLength = Math.PI*2*radius;
		System.out.println("Circumference:" + circleLength);
		
		double circleSquare = Math.PI* (radius * radius);
		System.out.println ("Circle square is:" + circleSquare);
		
 }
}