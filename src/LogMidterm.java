public class LogMidterm extends FunctionGrapher{
	public Coordinate xyStart() {
		return new Coordinate(1,-2);	
	}
	public double xRange() {
		return 10;

	}
	public double yRange() {
		return 7;
	}

	@Override
	public double xIncrement() {
		// TODO Auto-generated method stub
		return .1;
	}
	@Override
	public double yValue(double xValue) { // Need to convert from log base 0 to log base 2 using maths.
		// TODO Auto-generated method stub
		return ( Math.log(xValue)/(Math.log(2)) );
	}
	public static void main(String args[]) {
		LogMidterm f = new LogMidterm();
		f.drawGraph(0, 0, 300, 300);
	}
}
