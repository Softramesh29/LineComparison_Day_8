package com.bridgelabz.LineComparison;

public class ModelALineUC1 {
	public static void main (String[] args) {
		int x1, x2, y1, y2;
		double distance;
		
		x1 = 1;
		y1 = 1;
		x2 = 4;
		y2 = 4;
		
		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Distance is : " +distance);
	}
}
