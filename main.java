package sim;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main extends JFrame implements ActionListener{
	Simulator simulator;
	JComboBox<String> arrival,transmission;
	JLabel emissionRate,transmissionRate,msec,dropped;
	int speed;
	Thread gameT;
	main(){
		simulator = new Simulator();
		
	  	this.add(simulator);
	  	this.setResizable(false);
	  	this.setBackground(Color.white);
	  	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	this.pack();
	  	this.setVisible(true);
	  	//this.setLocationRelativeTo(null);
	  	Color lightGray = new Color(189, 189, 189);
	  	
	  	String[] arrivalRate = {"100 packet/s","300 packet/s","500 packet/s"};
	    String[] relayRate = {"300 packet/s","500 packet/s","800 packet/s"};
	  		
	  	   emissionRate = new JLabel("Emmission rate");
	       simulator.add(emissionRate);
	       emissionRate.setBounds(80, 190, 100, 20);
	       
	       arrival = new JComboBox<>(arrivalRate);
		   simulator.add(arrival);
		   arrival.setBounds(125,92,120,20);
		   arrival.setBackground(lightGray);
		   arrival.setOpaque(true);
		   arrival.setVisible(true);
	       
		   
	       transmissionRate = new JLabel("Transmission rate");
	       simulator.add(transmissionRate);
	       transmissionRate.setBounds(140, 190, 100, 20);
	      
	       transmission = new JComboBox<>(relayRate);
	       simulator.add(transmission);
	       transmission.setBounds(150,92,120,20);
	       transmission.setBackground(lightGray);
	       transmission.setOpaque(true);
	       transmission.setVisible(true);
	       
	       JButton startButton = new JButton("Start");
		   simulator.add(startButton);
		   startButton.setBounds(185, 100, 100, 20);
		   Color startColor = new Color(76, 228, 53);
		   startButton.setBackground(startColor);
		   startButton.setOpaque(true);
		   startButton.addActionListener(this);
		      
		   JButton resetButton = new JButton("Reset");
		   simulator.add(resetButton);
		   resetButton.setBounds(250, 400, 100, 20);
		   Color resetColor = new Color(199, 56, 56);
		   resetButton.setBackground(resetColor);
		   resetButton.setOpaque(true);
		   resetButton.addActionListener(this);
		   
		   
		   Color purple = new Color(191,111,238);
		   msec = new JLabel("0.000 msec");
	       simulator.add(msec);
	       emissionRate.setBounds(30, 295, 100, 20);
	       
	       dropped = new JLabel("0 packets dropped out of 0");
	       simulator.add(dropped);
	       Color droppedColor = new Color(226,226,226);
	       dropped.setForeground(purple);
	       dropped.setBackground(droppedColor);
	       dropped.setOpaque(true);
	       dropped.setBounds(30, 400, 100, 20);
	}

	public static void main(String[] args) {
		main GPAFrame = new main();
        GPAFrame.setTitle("Packet Simulator");
        GPAFrame.setSize(930,325);
        GPAFrame.setVisible(true);
        GPAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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
				repaint();
				delta--;
		}
	}
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")) {
			gameT = new Thread();
			gameT.start();
			Simulator.move();
		}
		
	}

}
