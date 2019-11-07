import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public abstract class XYGrapher {

	abstract public Coordinate xyStart();
	abstract public double xRange();
	abstract public double yRange();
	abstract public Coordinate getPoint(int pointNum);

	public void drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh) {
		Coordinate startingPoint = this.xyStart();
		Coordinate currentPoint;
		double yRange = this.yRange();
		double xRange = this.xRange();
		ArrayList<Coordinate> coordinate = new ArrayList<Coordinate>();
		
		currentPoint =  this.getPoint(0);
		int couunter1 = 0;
		currentPoint = this.getPoint(couunter1);
		while (currentPoint != null) {
			++couunter1;
			
				double xPixel = (double)xPixelStart + (currentPoint.getX() - startingPoint.getX()) * ((double)pixelsWide / xRange);
				double yPixel = (double)yPixelStart + (startingPoint.getY() + yRange - currentPoint.getY()) * ((double)pixelsHigh / yRange);
				coordinate.add(new Coordinate(xPixel, yPixel, currentPoint.drawFrom(), currentPoint.drawTo()));
			
			currentPoint = this.getPoint(couunter1);
		}
		int yAxis = xPixelStart - (int)(startingPoint.getX() * ((double)pixelsWide / xRange));
		int xAxis = yPixelStart + (int)((startingPoint.getY() + yRange) * ((double)pixelsHigh / yRange));


		JFrame frame = new JFrame("Advanced-OO: XYGrapher");
		Coordinate[] temp = new Coordinate[]{};
		XYGraphingPanel panel = new XYGraphingPanel((Coordinate[])coordinate.toArray(temp),pixelsWide, pixelsHigh, xAxis, yAxis);
		//size
		Dimension size = new Dimension(pixelsWide, pixelsHigh);
		panel.setPreferredSize(size);
		panel.setMinimumSize(size);
		panel.setMaximumSize(size);

		frame.add(panel);
		frame.setDefaultCloseOperation(3);
		frame.pack();
		//don't want to be able to change it bc it might mess things up in the future
		frame.setResizable(false);

		Dimension d = frame.getToolkit().getScreenSize();
		Dimension me = frame.getSize();
		frame.setLocation(d.width / 2 - me.width / 2, d.height / 2 - me.height / 2);
		frame.setVisible(true);


	}


}
class XYGraphingPanel extends JPanel {

	private static final long serialVersionUID = 181880896580762014L; 
	Coordinate[] coordinates;
	int pixelsWide;
	int pixelsHigh;
	int xAxis;
	int yAxis;

	XYGraphingPanel(Coordinate[] coordinatePoints, int pixelsWide, int pixelsHigh, int xAxis, int yAxis) {
		this.coordinates = coordinatePoints;
		this.pixelsWide = pixelsWide;
		this.pixelsHigh = pixelsHigh;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public void paint(Graphics g) {

		if (this.xAxis > 0 && this.xAxis < this.pixelsHigh) {
			g.setColor(Color.GREEN);
			g.drawLine(0, this.xAxis, this.pixelsWide, this.xAxis);
		}
		//don't include else if cause this is the axis for obvious reasons
		if (this.yAxis > 0 && this.yAxis < this.pixelsHigh) {
			g.setColor(Color.GREEN);
			g.drawLine(this.yAxis, 0, this.yAxis, this.pixelsHigh);
		}
		//sets brush to black
		g.setColor(Color.BLACK);


		for(int counter = 1; counter< coordinates.length; counter++) {
			if (this.coordinates[counter].drawTo()) {
				double yCoordinate, xCoordinate;

				double x2 = this.coordinates[counter].getX();
				double y2 = this.coordinates[counter].getY();
				if (counter == 0) {
					xCoordinate = this.coordinates[counter].getX();
					yCoordinate = this.coordinates[counter].getY();

				} else if (this.coordinates[counter - 1].drawFrom()) {


					xCoordinate = this.coordinates[counter - 1].getX();
					yCoordinate = this.coordinates[counter - 1].getY();

				} else {
					xCoordinate = x2;
					yCoordinate = y2;
				}
				if (this.coordinates[counter].drawTo() && this.coordinates[counter - 1].drawFrom()) {
					//ToDo: this part actually draws the line. Remember to set the brush to the black color. 
					g.drawLine((int)xCoordinate, (int)yCoordinate, (int)x2, (int)y2);
				}
			}
		}

		// Delete ALL Previous failures b4 turning in assignment: Locations (3 - Below this line and  1- part above this line)

	}
}

