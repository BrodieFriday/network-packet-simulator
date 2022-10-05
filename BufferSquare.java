package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class BufferSquare extends Rectangle {
	
	
	BufferSquare(int xAxis, int yAxis, int squareWidth, int squareHeight){
	    super(xAxis,yAxis,squareWidth,squareHeight);
	}
	
	public void drawSquare(Graphics g){
		
	      g.setColor(Color.black);
		g.drawRect(x,y,width,height);
	}
}