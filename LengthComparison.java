package day8;

import java.util.Scanner;

public class LengthComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line computation program");

		System.out.println("enter the end points of line1 : ");
		double line1 = LengthCal();

		System.out.println("enter the end points of line2 : ");
		double line2 = LengthCal();

		if (line1 == line2)
			System.out.println("Lines are equal");
		else if (line1 > line2)
			System.out.println("line1 is greater");
		else
			System.out.println("line2 is greater");

	}

	private static double LengthCal() {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of x1 : ");
		double x1 = s.nextDouble();

		System.out.println("enter the value of y1");
		double y1 = s.nextDouble();

		System.out.println("enter the value of x2");
		double x2 = s.nextDouble();

		System.out.println("enter the value of y2");
		double y2 = s.nextDouble();

		double length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.println("length of a line is : " + length);
		return length;

	}

}
