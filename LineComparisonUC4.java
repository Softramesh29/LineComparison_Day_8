package com.bridgelabz.LineComparison;
public class LineComparisonUC4 {
	public static double Line1() {
		int x1, x2, y1, y2;
		double line_1;
		x1=1; y1=1; x2=5; y2=5;
		line_1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println(" Distance of Line_1 : " +line_1);
		return line_1;		
	}
	public static double Line2() {
		int a1, a2, b1, b2;
		double line_2;
		a1=1; b1=1; a2=4; b2=4;
		line_2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println(" Distance of Line_2 : " +line_2);
		return line_2;
	}
	public static void Comparison(double line_1, double line_2) {
		if (line_1 == line_2)
			System.out.println(" Two lines are equal ");
		else if (line_1 > line_2)
			System.out.println(" Line_1 length is greater than Line_2 ");
		else
			System.out.println(" Line_1 length is lower than Line_2 ");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");
		LineComparisonUC4 compare = new LineComparisonUC4();
		compare.Comparison(Line1(), Line2());
		
		
	}
}
