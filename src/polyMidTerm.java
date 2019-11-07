
public  class polyMidTerm extends PolynomialGrapher{

	@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate (-2,-7);
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public double xIncrement() {
		// TODO Auto-generated method stub
		return .1;
	}


	public double[] coefficients() {
		// TODO Auto-generated method stub
		double[] array = {-3, -5, 2};
		return array;
	}



	public static void main (String args[]) {
		polyMidTerm tester = new polyMidTerm();
		tester.drawGraph(0, 0, 300, 300);
	}

}
