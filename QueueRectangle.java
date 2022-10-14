package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class QueueRectangle extends Rectangle {
	
	int queueId;
	QueueRectangle(int xAxis, int yAxis, int rectangleWidth, int rectangleHeight,int queueId){
	    super(xAxis,yAxis,rectangleWidth,rectangleHeight);
	    this.queueId = queueId;
	}
	
	public void drawRectangle(Graphics g){
		
		Color red = new Color(239, 47, 25);
		Color lightPink = new Color(242,154,227);
		Color gray = new Color(172,167,167);
		Color darkGreen = new Color(42,142,26);
		if(queueId==0) {
		     g.setColor(Color.black);
			 g.drawRect(x,y,width,height);
		}
		if(queueId==1) {
			g.setColor(Color.blue);
			g.fillRect(x,y,width,height);
		}
		if(queueId==2) {
			g.setColor(red);
			g.fillRect(x,y,width,height);
		}
		if(queueId==3) {
			g.setColor(lightPink);
			g.fillRect(x,y,width,height);
		}
		if(queueId==4) {
			g.setColor(Color.black);
			g.fillRect(x,y,width,height);
		}
		if(queueId==5) {
			g.setColor(gray);
			g.fillRect(x,y,width,height);
		}
		if(queueId==6) {
			g.setColor(darkGreen);
			g.fillRect(x,y,width,height);
		}
		
	}
}