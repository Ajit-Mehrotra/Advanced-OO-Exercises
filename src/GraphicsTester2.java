
public class GraphicsTester2 extends XYGrapher{
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
			return (new Coordinate( 0, 1));
		}else if(pointNum == 1) {
			return new Coordinate( -.5, 0, false ,true);
		}else if(pointNum == 2) {
			return new Coordinate( .5, 0);
		}else if(pointNum == 3) {
			return new Coordinate( 0, 1);
		}else if(pointNum == 4) {
			return new Coordinate( .5, 0, true, false);
		}else if(pointNum == 5) {
			return new Coordinate( 1.5, .25);
		}else if(pointNum == 6) {
			return new Coordinate( .5, -1);
		}else if(pointNum == 7) {
			return new Coordinate(-.5, 0, true, false);
		}else if(pointNum == 8) {
			return new Coordinate(-1.5, .25);
		}else if(pointNum == 9) {
			return new Coordinate( -.5, -1);
		}else if(pointNum == 10) {
			return new Coordinate( 0, -1,true, false);
		}else if(pointNum == 11) {
			return new Coordinate( .5, -1, true, false);
		}else if(pointNum == 12) {
			return new Coordinate( 1, -2);
		}else if(pointNum == 13) {
			return new Coordinate( 1, -2);
		}else if(pointNum == 14) {
			return new Coordinate( 0, -1);
		}
		else if(pointNum == 15) {
			return new Coordinate( -.5, -1, true, false);
		} else if(pointNum == 16) {
			return new Coordinate( -1, -2);
		} else if(pointNum == 17) {
			return new Coordinate( 0, -1,true, true);
		}       
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		GraphicsTester2 x = new GraphicsTester2();
		x.drawGraph(0,0,200,200);
	}

}

