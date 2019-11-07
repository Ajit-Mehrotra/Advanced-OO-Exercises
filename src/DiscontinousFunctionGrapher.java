
public abstract class DiscontinousFunctionGrapher extends FunctionGrapher{

	public boolean exclude(double xValue) {
		return false;
	}

	public Coordinate getPoint(int pointNum) {
		double xValue = this.xValue(pointNum);
		boolean exclude = this.exclude(xValue);
		if(exclude) {
			return new Coordinate(xValue, 0, false, false);
		}else {
			return super.getPoint(pointNum);
		}
	}

	
}
