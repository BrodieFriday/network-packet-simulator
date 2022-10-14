package sim;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class SimulatorStart extends JPanel{
	LongRectangle arrivalRectangle;
	LongRectangle transmissionRectangle;
	BufferSquare bufferSquare;
	QueueRectangle queueRectangle1;
	QueueRectangle queueRectangle2;
	QueueRectangle queueRectangle3;
	QueueRectangle queueRectangle4;
	QueueRectangle queueRectangle5;
	QueueRectangle queueRectangle6;
	QueueRectangle queueRectangle7;
	QueueRectangle queueRectangle8;
	QueueRectangle queueRectangle9;
	QueueRectangle queueRectangle10;
	Packet packet1;
	Packet packet2;
	Packet packet3;
	Packet packet4;
	Packet packet5;
	Packet packet6;
	Image image;
	Graphics graphics;
	Thread gameT;
	
	
	public SimulatorStart() {
		longRectangle();
		queueRectangle();
		bufferSquare();
		packet();
		this.setFocusable(true);
	}
	public void packet() {
		
	}
	public void longRectangle() {
		arrivalRectangle = new LongRectangle(80,130,295,25);
		transmissionRectangle = new LongRectangle(585,130,295,25);
	}
	
	public void queueRectangle() {
		queueRectangle1 = new QueueRectangle(375,90,15,100,0);
		queueRectangle2 = new QueueRectangle(390,90,15,100,0);
		queueRectangle3 = new QueueRectangle(405,90,15,100,0);
		queueRectangle4 = new QueueRectangle(420,90,15,100,0);
		queueRectangle5 = new QueueRectangle(435,90,15,100,0);
		queueRectangle6 = new QueueRectangle(450,90,15,100,0);
		queueRectangle7 = new QueueRectangle(465,90,15,100,0);
		queueRectangle8 = new QueueRectangle(480,90,15,100,0);
		queueRectangle9 = new QueueRectangle(495,90,15,100,0);
		queueRectangle10 = new QueueRectangle(510,90,15,100,0);
	}
	
	public void bufferSquare() {
		bufferSquare = new BufferSquare(525,115,60,60,0);
	}
	
	public void draw(Graphics g) {
		arrivalRectangle.drawRectangle(g);
		transmissionRectangle.drawRectangle(g);
		bufferSquare.drawSquare(g);
		queueRectangle1.drawRectangle(g);
		queueRectangle2.drawRectangle(g);
		queueRectangle3.drawRectangle(g);
		queueRectangle4.drawRectangle(g);
		queueRectangle5.drawRectangle(g);
		queueRectangle6.drawRectangle(g);
		queueRectangle7.drawRectangle(g);
		queueRectangle8.drawRectangle(g);
		queueRectangle9.drawRectangle(g);
		queueRectangle10.drawRectangle(g);
	
		
	}
	
	public void paintComponent(Graphics g) {
		image = createImage(getWidth(),getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image,0,0,this);
	}
	
	public void movePacket1Arrival() {
		packet1.moveArrivalPacket();
	}
	public void movePacket2Arrival() {
		packet2.moveArrivalPacket();
	}
	public void movePacket3Arrival() {
		packet3.moveArrivalPacket();
	}
	public void movePacket4Arrival() {
		packet4.moveArrivalPacket();
	}
	public void movePacket5Arrival() {
		packet5.moveArrivalPacket();
	}
	public void movePacket6Arrival() {
		packet6.moveArrivalPacket();
	}
	
	public void movePacket1Transmission() {
		packet1.moveTransmissionPacket();
	}
	public void movePacket2Transmission() {
		packet2.moveTransmissionPacket();
	}
	public void movePacket3Transmission() {
		packet3.moveTransmissionPacket();
	}
	public void movePacket4Transmission() {
		packet4.moveTransmissionPacket();
	}
	public void movePacket5Transmission() {
		packet5.moveTransmissionPacket();
	}
	public void movePacket6Transmission() {
		packet6.moveTransmissionPacket();
	}

	
	public void checkCollision() {
		if(packet1.x >= 375) {
			bufferSquare = new BufferSquare(525,115,60,60,1);
		}
		if(packet2.x >= 375) {
			bufferSquare = new BufferSquare(525,115,60,60,2);
		}
		if(packet3.x >= 375) {
			bufferSquare = new BufferSquare(525,115,60,60,3);
		}
		if(packet4.x >= 375) {
			bufferSquare = new BufferSquare(525,115,60,60,4);
		}
		if(packet5.x >= 375) {
			bufferSquare = new BufferSquare(525,115,60,60,5);
		}
		if(packet6.x >= 375) {
			bufferSquare = new BufferSquare(525,115,60,60,6);
		}
		
		
		
		
		
		if(packet1.x >= 855) {
			packet1.x = 80;
		}
		if(packet2.x >= 855) {
			packet2.x = 80;
		}
		if(packet3.x >= 855) {
			packet3.x = 80;
		}
		if(packet4.x >= 855) {
			packet4.x = 80;
		}
		if(packet5.x >= 855) {
			packet5.x = 80;
		}
		if(packet6.x >= 855) {
			packet6.x = 80;
		}
	}
}