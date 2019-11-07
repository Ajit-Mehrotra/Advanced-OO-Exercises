
public class ParametricTester2 extends ParametricGrapher{


	public double tInterval() {
		// TODO Auto-generated method stub
		return 0.05*Math.PI;
	}


	public double tStart() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double tEnd() {
		// TODO Auto-generated method stub
		return 2*Math.PI;
	}


	public double xValue(double tValue) {
		// TODO Auto-generated method stub
		return (3 * Math.cos(tValue));
	}


	public double yValue(double tValue) {
		// TODO Auto-generated method stub
		return (.5* Math.sin(tValue));
	}


	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(-5,-5);
	}


	public double xRange() {
		// TODO Auto-generated method stub
		return 10;
	}


	public double yRange() {
		// TODO Auto-generated method stub
		return 10;
	}

	public static void main(String args[]) {
		ParametricTester2 tester = new ParametricTester2();
		tester.drawGraph(0, 0, 300, 300);
	}



}
