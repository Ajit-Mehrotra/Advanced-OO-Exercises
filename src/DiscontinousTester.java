
public class DiscontinousTester extends DiscontinousFunctionGrapher{

	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(0,0);
	}

	public double xRange() {
		// TODO Auto-generated method stub
		return 3;
	}

	public double yRange() {
		// TODO Auto-generated method stub
		return 5;
	}

	public double xIncrement() {
		// TODO Auto-generated method stub
		return .2;
	}

	public boolean exclude(double xValue) {
		if(xValue == 1) {
			return true;
		}else {
			return false;
		}
	} 

	public double yValue(double xValue) {
		return (Math.pow(xValue,2) - 1) /(xValue-1);

	}
	public static void main(String args[]) {
		DiscontinousTester tester = new DiscontinousTester();
		tester.drawGraph(0, 0, 300, 300);
	}

}
