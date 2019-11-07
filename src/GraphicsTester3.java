import java.util.ArrayList;

public class GraphicsTester3 extends XYGrapher {


	ArrayList<Coordinate> coordinate = new ArrayList<Coordinate>();

	public Coordinate getPoint(int pointNum) {

		if(pointNum == 0) {
			return new Coordinate( -1, -1);
		}else if(pointNum == 1) {
			return new Coordinate( 0, 1);
		}else if(pointNum == 2) {
			return new Coordinate( 1, -1);
		}else if(pointNum == 3) {
			return new Coordinate( -1, -1);
		}else if(pointNum == 4) {
			return new Coordinate( -.5, -.5, true, false);
		}else if(pointNum == 5) {
			return new Coordinate( 0, .5);
		}else if(pointNum == 6) {
			return new Coordinate( .5, -.5);
		}else if(pointNum == 7) {
			return new Coordinate( -.5, -.5);
		}

		return null;


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



	public static void main (String args[]) {
		GraphicsTester3 tester  = new GraphicsTester3();

		tester.drawGraph(0,0, 200, 200);
	}

}
