
public class discontinousMidTerm extends DiscontinousFunctionGrapher{

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

	public double xIncrement() {
		// TODO Auto-generated method stub
		return .1;
	}

	public boolean exclude(double xValue) {
		if(xValue == 1 || xValue == -1 ) {

			return true;
		}else {
			return false;
		}
	} 

	public double yValue(double xValue) {
		return (1/ ((xValue + 1)* (xValue - 1)) );

	}
	public static void main(String args[]) {
		discontinousMidTerm tester = new discontinousMidTerm();
		tester.drawGraph(0, 0, 300, 300);
	}

}
