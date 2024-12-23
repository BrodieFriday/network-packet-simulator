package sim;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Simulator extends JPanel implements Runnable {
	int width = 900;
	int height = 325;
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
	Dimension packetSimScreen = new Dimension(width,height);
	
	
	public Simulator() {
		longRectangle();
		queueRectangle();
		bufferSquare();
		packet();
		this.setFocusable(true);
		this.setPreferredSize(packetSimScreen);
		gameT = new Thread(this);
		gameT.start();
	}
	
	public void packet() {
		packet6 = new Packet(80,130,25,25,6);
		packet5 = new Packet(80,130,25,25,5);
		packet4 = new Packet(80,130,25,25,4);
		packet3 = new Packet(80,130,25,25,3);
		packet2 = new Packet(80,130,25,25,2);
		packet1 = new Packet(80,130,25,25,1);
		
			
			
		
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
		packet1.drawSquare(g);
		packet2.drawSquare(g);
		packet3.drawSquare(g);
		packet4.drawSquare(g);
		packet5.drawSquare(g);
		packet6.drawSquare(g);

		
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
		
		
		if(packet1.x>=350 && packet1.x <= 585) {
			packet1.packetId=0;
	    }
		else {
			packet1.packetId=1;
		}
		
		if(packet2.x>=350 && packet2.x <= 585) {
			packet2.packetId=0;
	    }
		else {
			packet2.packetId=2;
		}
		
		if(packet3.x>=350 && packet3.x <= 585) {
			packet3.packetId=0;
	    }
		else {
			packet3.packetId=3;
		}
		
		if(packet4.x>=350 && packet4.x <= 585) {
			packet4.packetId=0;
	    }
		else {
			packet4.packetId=4;
		}
		
		if(packet5.x>=350 && packet5.x <= 585) {
			packet5.packetId=0;
	    }
		else {
			packet5.packetId=5;
		}
		
		if(packet6.x>=350 && packet6.x <= 585) {
			packet6.packetId=0;
	    }
		else {
			packet6.packetId=6;
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
	public void run() {
		//I got this from stackExchage. It is supposed to be the game loop that MC uses. Idk how to do game loops so this was best I
		// could do. This may be the weakest part, not sure. Here's a link to the post tho.
		//https://gamedev.stackexchange.com/questions/52841/the-most-efficient-and-accurate-game-loop
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			lastTime = now;
			if(delta >= 1) {
				movePacket1Arrival();
				checkCollision();
				repaint();
				delta--;
				
				if(packet1.x>=115) {
					movePacket2Arrival();
			}
				if(packet2.x>=115) {
					movePacket3Arrival();
			}
				if(packet3.x>=115) {
					movePacket4Arrival();
			}
				if(packet4.x>=115) {
					movePacket5Arrival();
			}
				if(packet5.x>=115) {
					movePacket6Arrival();
			}
				
				
				if(packet1.x>=585) {
					movePacket1Transmission();
			}
				if(packet2.x>=585) {
					movePacket2Transmission();
			}
				if(packet3.x>=585) {
					movePacket3Transmission();
			}
				if(packet4.x>=585) {
					movePacket4Transmission();
			}
				if(packet5.x>=585) {
					movePacket5Transmission();
			}
				if(packet6.x>=585) {
					movePacket6Transmission();
			}
				
				
				
	}
}

	}
}