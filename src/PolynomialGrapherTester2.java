
public  class PolynomialGrapherTester2 extends PolynomialGrapher{

	@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate (-4,-2);
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public double xIncrement() {
		// TODO Auto-generated method stub
		return .1;
	}


	public double[] coefficients() {
		// TODO Auto-generated method stub
		double[] array =  {1, -3, -4, 12};
		return array;
	}



	public static void main (String args[]) {
		PolynomialGrapherTester2 tester = new PolynomialGrapherTester2();
		tester.drawGraph(0, 0, 300, 300);
	}

}
