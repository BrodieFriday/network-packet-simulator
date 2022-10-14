package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class BufferSquare extends Rectangle {
	
	int bufferId;
	BufferSquare(int xAxis, int yAxis, int squareWidth, int squareHeight,int bufferId){
	    super(xAxis,yAxis,squareWidth,squareHeight);
	    this.bufferId = bufferId;
	}
	
	public void drawSquare(Graphics g){
		
		Color red = new Color(239, 47, 25);
		Color lightPink = new Color(242,154,227);
		Color gray = new Color(172,167,167);
		Color darkGreen = new Color(42,142,26);
		if(bufferId==0) {
		     g.setColor(Color.black);
			 g.drawRect(x,y,width,height);
		}
		if(bufferId==1) {
			g.setColor(Color.blue);
			g.fillRect(x,y,width,height);
		}
		if(bufferId==2) {
			g.setColor(red);
			g.fillRect(x,y,width,height);
		}
		if(bufferId==3) {
			g.setColor(lightPink);
			g.fillRect(x,y,width,height);
		}
		if(bufferId==4) {
			g.setColor(Color.black);
			g.fillRect(x,y,width,height);
		}
		if(bufferId==5) {
			g.setColor(gray);
			g.fillRect(x,y,width,height);
		}
		if(bufferId==6) {
			g.setColor(darkGreen);
			g.fillRect(x,y,width,height);
		}
	}
}