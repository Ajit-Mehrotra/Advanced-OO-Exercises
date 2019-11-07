
abstract public class PolynomialGrapher extends FunctionGrapher{



	abstract public double[] coefficients();


	public double yValue(double xValue) {
		double[] array = this.coefficients();
		double yVal = 0;
		for(int counter = 0; counter < array.length; counter++ ) {
			if(counter == 0) {
				yVal = array[0];
			}else {
				yVal += Math.pow(xValue, counter) * array[counter]; 
			}

		}
		return yVal;


	}




}
