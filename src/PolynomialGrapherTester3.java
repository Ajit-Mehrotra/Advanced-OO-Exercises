
public  class PolynomialGrapherTester3 extends PolynomialGrapher{

	@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate (-5,-5);
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public double xIncrement() {
		// TODO Auto-generated method stub
		return .5;
	}


	public double[] coefficients() {
		double[] array =  {1, -2};
		return array;
	}



	public static void main (String args[]) {
		PolynomialGrapherTester3 tester = new PolynomialGrapherTester3();
		tester.drawGraph(0, 0, 300, 300);
	}

}
