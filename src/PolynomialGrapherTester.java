
public  class PolynomialGrapherTester extends PolynomialGrapher{

	@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate (0,0);
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double xIncrement() {
		// TODO Auto-generated method stub
		return .2;
	}


	public double[] coefficients() {
		// TODO Auto-generated method stub
		double[] array = {4.8, -1.2, .2};
		return array;
	}



	public static void main (String args[]) {
		PolynomialGrapherTester tester = new PolynomialGrapherTester();
		tester.drawGraph(0, 0, 300, 300);
	}

}
