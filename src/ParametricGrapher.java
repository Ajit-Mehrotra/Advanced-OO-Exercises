
public abstract class ParametricGrapher extends XYGrapher{
	abstract public double tInterval();
	abstract public double tStart();
	abstract public double tEnd();
	abstract public double xValue(double tValue);
	abstract public double yValue(double tValue);

	public Coordinate getPoint(int pointNum) {
		double  tValue  = this.tStart() + ((double)pointNum* this.tInterval());
		if(tValue >= this.tStart() && tValue <= this.tEnd() ) {

			return new Coordinate(this.xValue(tValue), this.yValue(tValue));

		}else {
			//System.out.println(tValue);
			//System.out.println(this.tEnd());
			return null;
		}
	}
}
