public class sinMidTerm extends FunctionGrapher{
	public Coordinate xyStart() {
		return new Coordinate(0,-6);	
	}
	public double xRange() {
		return 12;

	}
	public double yRange() {
		return 12;
	}

	@Override
	public double xIncrement() {
		// TODO Auto-generated method stub
		return .1;
	}
	@Override
	public double yValue(double xValue) { 
		// TODO Auto-generated method stub
		return ( (5*Math.sin(xValue)) * Math.sin(6*xValue) );
	}
	public static void main(String args[]) {
		sinMidTerm f = new sinMidTerm();
		f.drawGraph(0, 0, 200, 200);
	}
}
