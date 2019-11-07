
public class DiscontinousTester2 extends DiscontinousFunctionGrapher{

	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(-3,-3);
	}

	public double xRange() {
		// TODO Auto-generated method stub
		return 6;
	}

	public double yRange() {
		// TODO Auto-generated method stub
		return 6;
	}

	public double xIncrement() {
		// TODO Auto-generated method stub
		return .2;
	}

	public boolean exclude(double xValue) {
		if(xValue == 0) {
			return true;
		}else {
			return false;
		}
	} 

	public double yValue(double xValue) {
		return 1/(xValue);

	}
	public static void main(String args[]) {
		DiscontinousTester2 tester = new DiscontinousTester2();
		tester.drawGraph(0, 0, 300, 300);
	}

}
