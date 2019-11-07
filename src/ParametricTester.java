
public class ParametricTester extends ParametricGrapher{


	public double tInterval() {
		// TODO Auto-generated method stub
		return 0.05*Math.PI;
	}


	public double tStart() {
		// TODO Auto-generated method stub
		return (Math.PI/2);
	}


	public double tEnd() {
		// TODO Auto-generated method stub
		return (3*Math.PI/2);
	}


	public double xValue(double tValue) {
		// TODO Auto-generated method stub
		return Math.cos(tValue);
	}


	public double yValue(double tValue) {
		// TODO Auto-generated method stub
		return Math.sin(tValue);
	}


	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(-1,-1);
	}


	public double xRange() {
		// TODO Auto-generated method stub
		return 2;
	}


	public double yRange() {
		// TODO Auto-generated method stub
		return 2;
	}

	public static void main(String args[]) {
		ParametricTester tester = new ParametricTester();
		tester.drawGraph(0, 0, 300, 300);
	}



}
