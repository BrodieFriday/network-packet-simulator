package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class QueueRectangle extends Rectangle {
	
	
	QueueRectangle(int xAxis, int yAxis, int rectangleWidth, int rectangleHeight){
	    super(xAxis,yAxis,rectangleWidth,rectangleHeight);
	}
	
	public void drawRectangle(Graphics g){
		
	      g.setColor(Color.black);
		g.drawRect(x,y,width,height);
		
	}
}