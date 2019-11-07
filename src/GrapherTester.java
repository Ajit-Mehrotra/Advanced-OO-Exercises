class GrapherTester extends XYGrapher{

	public Coordinate xyStart(){
		return new Coordinate(-2,-2);
	}
	public double xRange(){
		return 4;
	}
	public double yRange(){
		return 4;
	} 
	public Coordinate getPoint(int pointNum){
		if(pointNum == 0) {
			return new Coordinate(-1,-1);
		}else if(pointNum == 1) {
			return new Coordinate(1,-1);
		}else if(pointNum == 2) {
			return new Coordinate(1,1);
		}else if(pointNum == 3) {
			return new Coordinate(-1,1);
		}else if(pointNum == 4) {
			return new Coordinate(-1,-1);
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		GrapherTester x = new GrapherTester();
		x.drawGraph(0,0,200,200);
	}
}

/*import java.util.ArrayList;

public class GrapherTester extends XYGrapher {


ArrayList<Coordinate> coordinate = new ArrayList<Coordinate>();
private void instantiate() {
	coordinate.add(new Coordinate(-1,-1));
	coordinate.add(new Coordinate( 1,-1));
	coordinate.add(new Coordinate( 1, 1));
	coordinate.add(new Coordinate(-1, 1));
	coordinate.add(new Coordinate(-1,-1));
}

@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		Coordinate obaby = new Coordinate(-2,-2);

		return obaby;
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public Coordinate getPoint(int pointNum) {
		// TODO Auto-generated method stub

		if(pointNum < coordinate.size()) {
			return coordinate.get(pointNum);
		}else {
			return null;
		}

	}
	public static void main (String args[]) {
		GrapherTester tester  = new GrapherTester();
		tester.instantiate();
		tester.drawGraph((int)tester.xyStart().getX(),(int)tester.xyStart().getY(), 200, 200);
	}

}
 */