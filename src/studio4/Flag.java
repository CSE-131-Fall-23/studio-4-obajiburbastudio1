package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.filledSquare(0.5, 0.5, 0.5);
	
	StdDraw.setPenColor(Color.RED);
	double[]x = {0.01,0.01,1};
	double[]y = {0, 1, 0.5};
	StdDraw.filledPolygon(x, y);
	
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.polygon(x, y);
	
	StdDraw.setPenColor(Color.WHITE);
	StdDraw.filledSquare(0.5, 0.5, 0.15);
	
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.filledCircle(0.5, 0.5, 0.025);
	StdDraw.filledCircle(0.575, 0.575, 0.025);
	StdDraw.filledCircle(.575, .425, 0.025);
	StdDraw.filledCircle(0.425, .575, 0.025);
	StdDraw.filledCircle(0.425,0.425,0.025);
	
	StdDraw.setPenColor(0,0,100);
	StdDraw.filledRectangle(0.185, .5, 0.15, 0.25);
	}
}