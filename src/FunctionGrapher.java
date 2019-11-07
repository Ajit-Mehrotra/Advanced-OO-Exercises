
public abstract class FunctionGrapher extends XYGrapher {


	abstract public double xIncrement();

	abstract public double yValue(double xValue);

	public double xValue(int pointNum) {
		return (this.xyStart().getX()+ (pointNum*this.xIncrement()));
		
	}
	public Coordinate getPoint(int pointNum) {
		double xValue = this.xValue(pointNum);
		if(xValue  >= this.xyStart().getX() + this.xRange()) {
			if(xValue - this.xIncrement() <= this.xyStart().getX() + this.xRange()) {
				return new Coordinate(this.xyStart().getX() + this.xRange(),
						this.yValue(this.xyStart().getX() + this.xRange()));
			}else {
				return null;
			}
		}
		Coordinate coord = new Coordinate(xValue, this.yValue(xValue));
		return coord;
	}




}
