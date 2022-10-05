package sim;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Simulator extends JPanel {
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
	static Packet packet1;
	Packet packet2;
	Packet packet3;
	Packet packet4;
	Packet packet5;
	Packet packet6;
	Image image;
	Graphics graphics;
	Thread gameT;
	
	public Simulator() {
		longRectangle();
		queueRectangle();
		bufferSquare();
		packet();
	}
	public void packet() {
		packet1 = new Packet(80,130,25,25,1);
		packet2 = new Packet(105,130,25,25,2);
		packet3 = new Packet(130,130,25,25,3);
		packet4 = new Packet(155,130,25,25,4);
		packet5 = new Packet(180,130,25,25,5);
		packet6 = new Packet(205,130,25,25,6);
	}
	public void longRectangle() {
		arrivalRectangle = new LongRectangle(80,130,295,25);
		transmissionRectangle = new LongRectangle(585,130,295,25);
	}
	
	public void queueRectangle() {
		queueRectangle1 = new QueueRectangle(375,90,15,100);
		queueRectangle2 = new QueueRectangle(390,90,15,100);
		queueRectangle3 = new QueueRectangle(405,90,15,100);
		queueRectangle4 = new QueueRectangle(420,90,15,100);
		queueRectangle5 = new QueueRectangle(435,90,15,100);
		queueRectangle6 = new QueueRectangle(450,90,15,100);
		queueRectangle7 = new QueueRectangle(465,90,15,100);
		queueRectangle8 = new QueueRectangle(480,90,15,100);
		queueRectangle9 = new QueueRectangle(495,90,15,100);
		queueRectangle10 = new QueueRectangle(510,90,15,100);
	}
	
	public void bufferSquare() {
		bufferSquare = new BufferSquare(525,115,60,60);
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
		packet1.drawSquare(g);
		packet2.drawSquare(g);
		packet3.drawSquare(g);
		packet4.drawSquare(g);
		packet5.drawSquare(g);
		packet6.drawSquare(g);
		
	}
	
	public static void move() {
		packet1.move();
		packet1.setXDirection(5);
		
	
	}
	
	public void paintComponent(Graphics g) {
		image = createImage(getWidth(),getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image,0,0,this);
	}

}
