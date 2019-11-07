
public class parametricMidTerm extends ParametricGrapher{


	public double tInterval() {
		// TODO Auto-generated method stub
		return 0.05;
	}


	public double tStart() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double tEnd() {
		// TODO Auto-generated method stub
		return 20;
	}


	public double xValue(double tValue) {
		// TODO Auto-generated method stub
		return (tValue* Math.cos(tValue));
	}


	public double yValue(double tValue) {
		// TODO Auto-generated method stub
		return (tValue*Math.sin(tValue));
	}


	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(-20,-20);
	}


	public double xRange() {
		// TODO Auto-generated method stub
		return 40;
	}


	public double yRange() {
		// TODO Auto-generated method stub
		return 40;
	}

	public static void main(String args[]) {
		parametricMidTerm tester = new parametricMidTerm();
		tester.drawGraph(0, 0, 300, 300);
	}



}
