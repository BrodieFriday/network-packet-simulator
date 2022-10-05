package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class Packet extends Rectangle {
	int xdirection;
	int packetId;
	Packet(int x, int y, int squareWidth, int squareHeight, int packetId){
	    super(x,y,squareWidth,squareHeight);
	    this.packetId = packetId;
	}
	
	public void setXDirection(int xDir) {
		xdirection = xDir;
	}
	
	public void move() {
		x += xdirection;
	}
	
	public void drawSquare(Graphics g){
		Color red = new Color(239, 47, 25);
		Color lightPink = new Color(242,154,227);
		Color gray = new Color(172,167,167);
		Color darkGreen = new Color(42,142,26);
		if(packetId==1) {
			g.setColor(Color.blue);
		}
		if(packetId==2) {
			g.setColor(red);
		}
		if(packetId==3) {
			g.setColor(lightPink);
		}
		if(packetId==4) {
			g.setColor(Color.black);
		}
		if(packetId==5) {
			g.setColor(gray);
		}
		if(packetId==6) {
			g.setColor(darkGreen);
		}
	      
		g.fillRect(x,y,width,height);
	}
}