package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class Packet extends Rectangle {
	float arrival;
	float transmission;
	int packetId;
	float speedArrival;
	float speedTransmission;
	Packet(int x, int y, int squareWidth, int squareHeight, int packetId){
	    super(x,y,squareWidth,squareHeight);
	    this.packetId = packetId;
	    String arrivalSpeed = (String)SimStart.arrival.getSelectedItem();
		if(arrivalSpeed.equals("100 packet/s")) {
			speedArrival = 1.0f;
		}
		if(arrivalSpeed.equals("300 packet/s")) {
			speedArrival = 1.5f;
		}
		if(arrivalSpeed.equals("500 packet/s")) {
			speedArrival = 2.0f;
		}
		
		
		 String transmissionSpeed = (String)SimStart.transmission.getSelectedItem();
			if(transmissionSpeed.equals("300 packet/s")) {
				speedTransmission = 1.5f;
			}
			if(transmissionSpeed.equals("500 packet/s")) {
				speedTransmission = 2.0f;
			}
			if(transmissionSpeed.equals("800 packet/s")) {
				speedTransmission = 2.5f;
			}
		
		
		
		transmissionSpeed(speedTransmission);
		
	    arrivalSpeed(speedArrival);
	    
	}
	
	public void arrivalSpeed(float xDir) {
		arrival = xDir;
	}
	
	public void transmissionSpeed(float xDir) {
		transmission = xDir;
	}
	
	public void moveArrivalPacket() {
		x += arrival;
	}
	
	public void moveTransmissionPacket() {
		x += transmission;
	}
	
	public void drawSquare(Graphics g){
		Color red = new Color(239, 47, 25);
		Color lightPink = new Color(242,154,227);
		Color gray = new Color(172,167,167);
		Color darkGreen = new Color(42,142,26);
		Color c = new Color(1f,0f,0f,.0f);
		Color u = new Color(1f,0f,0f,.7f);
		if(this.packetId==0) {
			g.setColor(c);
			g.fillRect(x,y,width,height);
		}
		if(packetId==1) {
			g.setColor(Color.blue);
			g.fillRect(x,y,width,height);
		}
		if(packetId==2) {
			g.setColor(red);
			g.fillRect(x,y,width,height);
		}
		if(packetId==3) {
			g.setColor(lightPink);
			g.fillRect(x,y,width,height);
		}
		if(packetId==4) {
			g.setColor(Color.black);
			g.fillRect(x,y,width,height);
		}
		if(packetId==5) {
			g.setColor(gray);
			g.fillRect(x,y,width,height);
		}
		if(packetId==6) {
			g.setColor(darkGreen);
			g.fillRect(x,y,width,height);
		}
		 
	}
}