
public class Coordinate {
	double x;
	double y;

	boolean drawFrom;
	boolean drawTo;

	/*Create two constructors. The first will accept only x and y values and set both drawTo 
	and drawFrom to true.*/
	Coordinate(double xVal, double yVal){
		x= xVal;
		y = yVal;
		drawFrom = true;
		drawTo = true;
	}

	Coordinate(double xVal, double yVal, boolean drawFromThisPoint, boolean drawTothisPoint) {
		x= xVal;
		y = yVal;
		drawFrom = drawFromThisPoint;
		drawTo = drawTothisPoint;
	}



	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public boolean drawTo() {
		return drawTo;
	}
	public boolean drawFrom() {
		return drawFrom;
	}


}
